package com.tcs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tcs.bean.Course;
import com.tcs.constant.SQLQueries;
import com.tcs.util.DbUtil;

import ch.qos.logback.core.db.dialect.DBUtil;

public class AdminDAOImp implements AdminDAOInterface {
//	Connection con = DbUtil.getConnection();
//	SQLQueries sql = new SQLQueries();
//	
//	@Override
//	public List<Course> viewCourse(){
//		// TODO Auto-generated method stub
//		List<Course> courseList = new ArrayList<>();
//		try {
//			
//			PreparedStatement preparedStatement=con.prepareStatement(sql.LIST_COURSE);
//			ResultSet rs = preparedStatement.executeQuery();
//			System.out.println(rs);
//			while(rs.next()) {
//				Course course = new Course();
//				course.setCourseCode(rs.getString(1));
//				course.setCourseName(rs.getString(2));
//				courseList.add(course);
//			}
//		}catch(SQLException ex){
//			System.out.println(ex);
//		}
//		return courseList;
//	}
//	
//	@Override
//	public void addCourse(Course course) throws SQLException {
//		// TODO Auto-generated method stub
//		try {
////			System.out.println("hello here in dao");
//			PreparedStatement preparedStatement=connection.prepareStatement(SQLQueriesConstants.ADMIN_ADD_COURSE);
//			preparedStatement.setInt(1, course.getCourseId());
//			preparedStatement.setString(2, course.getCourseCode());
//			preparedStatement.setString(3, course.getCourseName());
////			System.out.println(preparedStatement);
//			int resultSet = preparedStatement.executeUpdate();
////			System.out.println(resultSet);
//			
//		}catch(SQLException ex) {
//			System.out.println(ex);
//		}
//	}
//	
//	@Override
//	public List allCourses() throws SQLException {
//		// TODO Auto-generated method stub
//		List<Course> courses = new ArrayList<Course>();
//		PreparedStatement stmt = connection.prepareStatement(SQLQueriesConstants.ADMIN_FETCH_COURSES);
//		ResultSet rs = stmt.executeQuery();
//		while(rs.next()) {
//			courses.add(new Course(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),
//					rs.getInt(5)));
//		}
//		return courses;
//	}
//	@Override
//	public void assignCourse(String courseCode, String instructorId) throws UserNotFoundException {
//		// TODO Auto-generated method stub
//		//System.out.println(courseCode+" "+instructorId);
//		try {
//			PreparedStatement stmt = connection.prepareStatement(SQLQueriesConstants.ADMIN_ADMIN_ASSIGNCOURSES);
//			stmt.setString(1,instructorId);
//			stmt.setString(2,courseCode);
//			//System.out.println(stmt);
//			int row = stmt.executeUpdate();
//		}catch(SQLException se) {
//			System.out.println(se);
//		}
//	}
//	@Override
//	public Course deleteCourse(String courseCode) throws SQLException {
//		// TODO Auto-generated method stub
//		String s = SQLQueriesConstants.ADMIN_SELECTED_COURSE+"'"+courseCode+"'";	
//		System.out.println(s);
//		PreparedStatement stmt = connection.prepareStatement(s);
//		ResultSet rs= stmt.executeQuery();
//		stmt = connection.prepareStatement(SQLQueriesConstants.ADMIN_DELETE_COURSE);
//		stmt.setString(1, courseCode);
//		System.out.println(stmt);
//		stmt.execute();
//		if (rs.next())
//			return new Course();
//		return null;
//	}

}
