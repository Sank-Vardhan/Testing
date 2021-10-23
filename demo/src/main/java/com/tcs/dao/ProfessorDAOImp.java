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

}
