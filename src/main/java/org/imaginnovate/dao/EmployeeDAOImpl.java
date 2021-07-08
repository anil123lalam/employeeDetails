package org.imaginnovate.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.imaginnovate.exception.BusinessException;
import org.imaginnovate.model.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAOImpl implements EmployeeDAO {

	private static String DB_URL = "jdbc:mysql://localhost:3306/mydb";
	private static String USER_NAME = "root";
	private static String PASS_WORD = "root";

	@Override
	public int saveEmployeeDetails(Employee emp) throws BusinessException {

		String employee_sql = "insert into employee_details(employee_code,emp_firstName,emp_lastName,emp_email,emp_doj,emp_salary) values(?,?,?,?,?,?)";
		// pklId is autoincrement primary column in mysql table employee_details table
		String employee_get_sql = "select pklId from employee_details where employee_code=?";
		String phone_sql = "insert into phone_numbers(phone_number,employee_id) values(?,?)";
		try(Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASS_WORD);)
		{
			PreparedStatement ps = con.prepareStatement(employee_sql);
			ps.setString(1, emp.getEmployeeCode());
			ps.setString(2, emp.getFirstName());
			ps.setString(3, emp.getLastName());
			ps.setString(4, emp.getEmail());
			ps.setString(5, emp.getDateOfJoining());
			ps.setString(6, emp.getSalaryPerMonth());
			ps.executeUpdate();
			PreparedStatement empGetSql = con.prepareStatement(employee_get_sql);
			empGetSql.setString(1, emp.getEmployeeCode());
			ResultSet rs = empGetSql.executeQuery();
			int id = 0;
			if (rs.next())
				id = rs.getInt("pklId");
			PreparedStatement phoneSql = con.prepareStatement(phone_sql);
			for (String phone : emp.getPhoneNumbers()) {
				phoneSql.setString(1, phone);
				phoneSql.setInt(2, id);
				phoneSql.addBatch();
			}
			phoneSql.executeBatch();
		} catch (Exception exception) {
			throw new BusinessException("Error occured while processing database logic" + exception.getMessage());
		}
		return 1;
	}
}
