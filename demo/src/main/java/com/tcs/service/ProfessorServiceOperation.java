package com.tcs.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tcs.bean.Professor;
import com.tcs.dao.ProfessorDAOInterface;

public class ProfessorServiceOperation implements ProfessorService{
	@Autowired
	private ProfessorDAOInterface professor;
	
	public List list() throws SQLException {
		return professor.list();
	}
	@Override
	public Professor create(Professor professor) throws SQLException{
		return professor;
	}
	@Override
	public Student viewEnrolledStudnets(int courseId,int studentId) throws SQLException{
		return student;
	}
	
	@Override
	public void addGrade(int courseId,int studentId) throws SQLException{
		
	}
	

}
