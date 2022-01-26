package com.simran.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Department {
	@Id
	private Integer departmentId;
	private String departmentName;
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
}
