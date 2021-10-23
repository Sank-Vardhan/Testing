package com.tcs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tcs.bean.Professor;
import com.tcs.constant.SQLQueries;
import com.tcs.util.DbUtil;

public class ProfessorDAOImp implements ProfessorDAOInterface {
	
	Connection con = DbUtil.getConnection();
	SQLQueries sql = new SQLQueries();
	
	public List list() throws SQLException {
		List<Professor> professor = new ArrayList<Professor>();
		PreparedStatement que = con.prepareStatement(sql.VIEW_STUDENT);
		System.out.println("Database Connected......");
		ResultSet rs = que.executeQuery();
		while(rs.next()) {
			professor.add(new Professor(rs.getInt(1),rs.getString(2),rs.getString(3)));
		}
		return professor;
	}
	
	@Override
	public Professor insert(Professor professor) throws SQLException{
		PreparedStatement s=con.prepareStatement(sql.ADD_PROFESSOR_QUERY);
		s.setInt(1,professor.getUserId());
		s.setString(2,professor.getDepartment());
		s.setString(3,professor.getDesignation());
		s.executeUpdate();		
		return professor;
	}
	
	@Override
	public Student viewEnrolledStudnets(int courseId,int studentId) throws SQLException{
		String st = sql.GET_STUDENT_ID+ studentId;
		PreparedStatement statement = con.prepareStatement(st);
		System.out.println("DB Connected");
		ResultSet rs= statement.executeQuery();
		if (rs.next())
			return new Student(rs.getInt("studentId"),rs.getString("name"),rs.getString("emailid"), rs.getString("branchname"), rs.getString("address"), rs.getBoolean("isapproved"), rs.getInt("roleid"));
		return null;
	}
	
	@Override
	public void addGrade(int courseId,int studentId) throws SQLException{
		PreparedStatement st1=con.preparedStatement(sql.ADD_GRADE);
		st1.setString(1,course.getGrade());
		st1.setString(2,course.getStudentId());
		st1.setString(3,professor.getCourseCode());
		st1.executeUpdate();
		
	}

}
