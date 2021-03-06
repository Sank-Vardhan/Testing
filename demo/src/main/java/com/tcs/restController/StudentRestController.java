package com.tcs.restController;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tcs.bean.Student;
import com.tcs.service.StudentService;
import com.tcs.service.StudentServiceOperation;

public class StudentRestController {
	@Autowired
	private StudentService student;
	
	@GetMapping("/students")
	public List getStudent() throws SQLException {
		return student.studentList();
	}
	@RequestMapping(value="/students/{id}",method=RequestMethod.GET)
	public ResponseEntity getId(@PathVariable("id") int id) throws SQLException {

		Student studentId = student.getId(id);
		if (studentId == null) {
			return new ResponseEntity("No Student found with ID " + id, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(studentId, HttpStatus.OK);
	}
	@DeleteMapping("/delete/student/{id}")
	public ResponseEntity deleteStudent(@PathVariable int id) throws SQLException {
		Student st = student.delete(id);
		if (null == st) {
			return new ResponseEntity("No Student found for ID " + id, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(id, HttpStatus.OK);
	}
	@PostMapping(value = "/post/student")
	public ResponseEntity createStudent(@RequestBody Student st) throws SQLException {

	//student;
		student.create(st);

		return new ResponseEntity(student, HttpStatus.OK);
	}
}
