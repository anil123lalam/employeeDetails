package org.imaginnovate.model;

import java.util.List;

public class Employee {
	private String employeeCode;
	private String firstName;
	private String lastName;
	private String email;
	private List<String> phoneNumbers;
	private String dateOfJoining;
	private String salaryPerMonth;

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getSalaryPerMonth() {
		return salaryPerMonth;
	}

	public void setSalaryPerMonth(String salaryPerMonth) {
		this.salaryPerMonth = salaryPerMonth;
	}

	@Override
	public String toString() {
		return "Employee [employeeCode=" + employeeCode + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", phoneNumbers=" + phoneNumbers + ", dateOfJoining=" + dateOfJoining
				+ ", salaryPerMonth=" + salaryPerMonth + "]";
	}
	
	
}
