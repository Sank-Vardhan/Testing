package com.tcs.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tcs.bean.Student;
import com.tcs.dao.StudentDAOInterface;

@Component
public class StudentServiceOperation implements StudentService {
	@Autowired
	private StudentDAOInterface student;
	
	@Override
	public List studentList() throws SQLException
	{
		return student.list();
	}
	
	public Student getId(int id) throws SQLException
	{
		return student.getId(id);
	}
	public Student create(Student st) throws SQLException
	{
		return st;
	}
	public Student delete(int id) throws SQLException
	{
		return null;
	}
}
