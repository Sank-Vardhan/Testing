package com.tcs.service;

import java.sql.SQLException;
import java.util.List;

import com.tcs.bean.Professor;

public interface ProfessorService {
	public Professor create(Professor prof) throws SQLException;
	public List list() throws SQLException;
}
