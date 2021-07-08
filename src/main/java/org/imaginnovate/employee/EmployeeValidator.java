package org.imaginnovate.employee;

import org.imaginnovate.exception.BusinessException;
import org.imaginnovate.model.Employee;
import org.springframework.stereotype.Component;
@Component
public class EmployeeValidator {

	public void empValidator(Employee emp) throws BusinessException {
		if (emp.getDateOfJoining() == null)
			throw new BusinessException("Date Of Joining is Empty");
		if (emp.getEmail() == null)
			throw new BusinessException("Email is Empty");
		if (emp.getEmployeeCode() == null)
			throw new BusinessException("EmployeeCode is Empty");
		if (emp.getFirstName() == null)
			throw new BusinessException("FirstName is Empty");
		if (emp.getLastName() == null)
			throw new BusinessException("LastName is Empty");
		if (emp.getPhoneNumbers() == null)
			throw new BusinessException("PhoneNumber is Empty");
		if (emp.getSalaryPerMonth() == null)
			throw new BusinessException("Salary is Empty");

	}

}
