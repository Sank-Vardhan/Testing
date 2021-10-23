package com.tcs.dao;

import java.sql.SQLException;
import java.util.List;

import com.tcs.bean.Professor;

public interface ProfessorDAOInterface {
	public List list() throws SQLException;

	public Professor insert(Professor professor) throws SQLException;
	public Student viewEnrolledStudnets() throws SQLException;
	public void addGrade(Course course,Student student) throws SQLException;

}
