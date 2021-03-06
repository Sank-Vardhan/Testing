package com.tcs.bean;

public class Student {
	private int studentId;       //1
	private String name;         //2
	private String emailId;      //3
	private String branchName;   //4
	private String address;      //5
	private Boolean isApproved;  //6
	private int roleId;	         //7
	public Student(int StudentId, String name, String emailId, String branchName, String address, Boolean isApproved,
			int roleId) {
		super();
		this.studentId = StudentId;
		this.name = name;
		this.emailId = emailId;
		this.branchName = branchName;
		this.address = address;
		this.isApproved = isApproved;
		this.roleId = roleId;
	}	
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Boolean getIsApproved() {
		return isApproved;
	}

	public void setIsApproved(Boolean isApproved) {
		this.isApproved = isApproved;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
}
