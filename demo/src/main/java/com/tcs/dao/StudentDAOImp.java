package com.tcs.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.tcs.bean.Student;
import com.tcs.constant.SQLQueries;
import com.tcs.util.DbUtil;

public class StudentDAOImp implements StudentDAOInterface{
	
	Connection con = DbUtil.getConnection();
	SQLQueries sql = new SQLQueries();
	
	public List list() throws SQLException {
		List<Student> student = new ArrayList<Student>();
		PreparedStatement que = con.prepareStatement(sql.VIEW_STUDENT);
		System.out.println("Database Connected......");
		ResultSet rs = que.executeQuery();
		while(rs.next()) {
			student.add(new Student(rs.getInt(1),rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5), rs.getBoolean(6), rs.getInt(7)));
		}
		return student;
	}
	
	@Override
	public Student getId(int id) throws SQLException {
		String st = sql.LIST_STUDENT_QUERY+ id;
		PreparedStatement statement = con.prepareStatement(st);
		System.out.println("DB Connected");
		ResultSet rs= statement.executeQuery();
		if (rs.next())
			return new Student(rs.getInt("studentId"),rs.getString("name"),rs.getString("emailid"), rs.getString("branchname"), rs.getString("address"), rs.getBoolean("isapproved"), rs.getInt("roleid"));
		return null;
	}
	
	@Override
	public Student create(Student student) throws SQLException {
		PreparedStatement que=con.prepareStatement(sql.ADD_STUDENT);
		que.setInt(1,student.getStudentId());
		que.setString(2,student.getName());
		que.setString(3,student.getEmailId());
		que.setString(4,student.getBranchName());
		que.setString(5,student.getAddress());
		que.setBoolean(6, student.getIsApproved());
		que.setInt(7, student.getRoleId());
		que.executeUpdate();
		return student;
	}
	@Override
	public Student delete(int id) throws SQLException{
		PreparedStatement statement = con.prepareStatement(sql.DELETE_STUDENT_QUERY) ;
		statement.setInt(1, id);
		statement.executeUpdate();
		return null;
	}
}
