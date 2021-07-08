package org.imaginnovate.employee;

import org.imaginnovate.dao.EmployeeDAO;
import org.imaginnovate.exception.BusinessException;
import org.imaginnovate.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeResource {
	@Autowired
	private EmployeeDAO empDao;
	@Autowired
	private EmployeeValidator empValidator;

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

	@PostMapping("/save")
	public String saveEmployeeDetails(@RequestBody Employee employee) throws BusinessException {
		String result = "sucess";
		try {
			empValidator.empValidator(employee);
			empDao.saveEmployeeDetails(employee);
		} catch (BusinessException e) {

			// Log the error either log4j or slf4j
			e.printStackTrace();
			result = e.getMessage();
		}
		return result;

	}
}
