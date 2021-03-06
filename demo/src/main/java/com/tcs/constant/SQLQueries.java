package com.tcs.constant;

public class SQLQueries {
	


	public static final String VIEW_STUDENT = "select * from student";
	/**
	 * General Queries
	 */
	public static final String UPDATE_PASSWORD="update user set password=? where userId = ? ";
	
	
	/**
	 * 
	 * Queries Related to Student Operation
	 * 
	 */
	public static final String ADD_COURSE_Student="insert into registeredcourse (studentId,courseCode) values ( ? , ? )";
	public static final String DROP_COURSE="delete from registeredcourse where courseCode = ? and studentId = ?";
	public static final String VIEW_GRADE ="select grade from registerCourse where studentID=?";
	public static final String ALTER_STUDENT ="alter table student add column studentID int";
	
	/**
	 * 
	 * Queries Related to Professor Operation
	 * 
	 * 
	 */
	public static final String GET_ROLE="select role from user where userId = ? ";
	public static final String GET_STUDENT_ID="select studentId from student where courseCode in (select courseCode from Course where courseCode =?) ";
	public static final String ADD_GRADE="update registeredcourse set grade=? where studentId=?  and courseCode=?";
	
	/**
	 * 
	 * Queries Related to Administrator Operation
	 * 
	 */	
	
	public static final String IS_APPROVED = "select isapproved from student where studentid = ? ";
	public static final String VERIFY_CREDENTIALS="select password from user where userId = ?";
	
	public static final String ADD_USER_QUERY = "insert into User(userId, password, role) values (?, ?, ?)";
	public static final String LIST_USER_QUERY = "select * from user where userId=?";
	public static final String DELETE_USER_QUERY = "delete from user where userId=?";
	public static final String UPDATE_USER_QUERY = "update user set userId=?,password=?,role=? where userId=?";
	
	public static final String ADD_PROFESSOR_QUERY = "insert into professor(userId, department, designation) values (?, ?, ?)";
	public static final String LIST_PROFESSOR_QUERY = "select * from professor where userId=?";
	public static final String DELETE_PROFESSOR_QUERY = "delete from professor where userId=?";
	public static final String UPDATE_PROFESSOR_QUERY = "update professor set userId=?,department=?,designation=? where userId=?";
	
	public static final String ADD_STUDENT = "insert into student (name,emailid,branchname,address,isapproved,roleid) values (?,?,?,?,?,?)";
	public static final String LIST_STUDENT_QUERY = "select * from studnet where studentId=?";
	public static final String DELETE_STUDENT_QUERY = "delete from student where studentId=?";
	public static final String UPDATE_STUDENT_QUERY = "update student set studentId=?,name=?,emailid=?,branchname=?,address=?,isapproved=?,roleid=? where studentId=?";
	
	/**
	 * 
	 * Queries Related to RegisredCourse Operation
	 * 
	 */
	public static final String ADD_REGISTERED_COURSE="insert into registeredcourse (studentId,courseCode,grade) values ( ? , ? , ? )";
	public static final String LIST_REGISTERED_COURSE="select * from registeredcourse where stdentId=?";
	public static final String DELETE_REGISTERED_COURSE="delete from registeredcourse where courseCode=?";
	public static final String UPDATE_REGISTERED_COURSE="update registeredcourse set courseCode=?,studentId=?,grade=? where studentId=?";
	
	
	/**
	 * 
	 * Queries Related to Course Operation
	 * 
	 */
	public static final String ADD_COURSE_ADMIN="insert into course (courseCode,CoureseName,professorID,catlogID) values ( ? , ? , ? , ? )";
	public static final String LIST_COURSE="select * from course where courseCode=?";
	public static final String DELETE_COURSE="delete from course where courseCode=?";
	public static final String UPDATE_COURSE="update course set courseCode=?,CoureseName=?,professorID=?,catlogID=? where courseCode=?";

}
