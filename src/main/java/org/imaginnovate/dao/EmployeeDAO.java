package org.imaginnovate.dao;

import org.imaginnovate.exception.BusinessException;
import org.imaginnovate.model.Employee;

public interface EmployeeDAO {

	public int saveEmployeeDetails(Employee emp) throws BusinessException;
}
