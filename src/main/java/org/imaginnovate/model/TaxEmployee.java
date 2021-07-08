package org.imaginnovate.model;

import java.math.BigDecimal;

public class TaxEmployee extends Employee{

	
	private double yearlySal;
	private double taxAmount;
	private double cessAmout;

	public double getYearlySal() {
		return yearlySal;
	}

	public void setYearlySal(double yearlySal) {
		this.yearlySal = yearlySal;
	}

	public double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public double getCessAmout() {
		return cessAmout;
	}

	public void setCessAmout(double cessAmout) {
		this.cessAmout = cessAmout;
	}
}
