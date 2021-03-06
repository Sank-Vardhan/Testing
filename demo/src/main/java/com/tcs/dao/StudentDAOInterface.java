package com.tcs.dao;

import java.sql.SQLException;
import java.util.List;

import com.tcs.bean.Student;

public interface StudentDAOInterface {
	public List list() throws SQLException;
	public Student getId(int id) throws SQLException;
	public Student create(Student student) throws SQLException;
	public Student delete(int id) throws SQLException;
}
