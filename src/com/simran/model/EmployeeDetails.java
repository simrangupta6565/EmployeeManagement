package com.simran.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class EmployeeDetails {
	@Id
	private String employeeEmail;
	private String employeeName;
	private String employeeDob;
	private String employeeDoj;
	private String employeeAddress;
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDob() {
		return employeeDob;
	}
	public void setEmployeeDob(String employeeDob) {
		this.employeeDob = employeeDob;
	}
	public String getEmployeeDoj() {
		return employeeDoj;
	}
	public void setEmployeeDoj(String employeeDoj) {
		this.employeeDoj = employeeDoj;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
}
