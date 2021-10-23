package com.tcs.bean;

public class Professor {
	int userId;
	String department;
	String designation;
	public Professor(int userId, String department, String designation) {
		super();
		this.userId = userId;
		this.department = department;
		this.designation = designation;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
}
