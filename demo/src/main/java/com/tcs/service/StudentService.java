package com.tcs.service;

import java.sql.SQLException;
import java.util.List;

import com.tcs.bean.Student;

public interface StudentService {
	public List studentList() throws SQLException;
	public Student getId(int id) throws SQLException;
	public Student create(Student st) throws SQLException;
	public Student delete(int id) throws SQLException;
}
