package org.imaginnovate.employee;

import org.imaginnovate.model.TaxEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeTax {

	@Autowired
	private EmployeeTaxCalculation empTaxCal;

	@GetMapping("/tax")
	public TaxEmployee getEmployeeTax(@RequestBody TaxEmployee emp) {
		//Calculating the Tax Yearly
		emp = empTaxCal.calculateTax(emp);
		return emp;
	}
}
