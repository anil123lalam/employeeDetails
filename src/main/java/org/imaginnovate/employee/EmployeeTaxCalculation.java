package org.imaginnovate.employee;

import org.imaginnovate.model.TaxEmployee;
import org.springframework.stereotype.Component;
@Component
public class EmployeeTaxCalculation {

	public TaxEmployee calculateTax(TaxEmployee taxEmployee) {
		double tax = 0.0, tax1 = 0.0, tax2 = 0.0, tax3 = 0.0;
		if (taxEmployee.getYearlySal() <= 2500000) {
			tax = 0.0;
		}
		if (taxEmployee.getYearlySal() > 2500000 && taxEmployee.getYearlySal() <= 5000000) {
			double tempsal = taxEmployee.getYearlySal() - 2500000;
			tax2 = tempsal * 5 / 100;
		}
		if (taxEmployee.getYearlySal() > 5000000 && taxEmployee.getYearlySal() <= 10000000) {
			double tempsal = taxEmployee.getYearlySal() - 10000000;
			tax1 = tempsal * 10 / 100;
		}

		if (taxEmployee.getYearlySal() > 10000000) {
			tax3 = 10000000 * 20 / 100;
		}
		double totalTax = tax + tax1 + tax2 + tax3;
		taxEmployee.setTaxAmount(totalTax);
		
		if (taxEmployee.getYearlySal() > 25000000) {
			taxEmployee.setCessAmout(taxEmployee.getYearlySal() * 2 / 100);
		}

		return taxEmployee;
	}
}
