package com.tcs.restController;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tcs.bean.Professor;
import com.tcs.service.ProfessorService;

public class ProfessorRestController {
	@Autowired
	private ProfessorService professor;
	
	@GetMapping("/professor")
	public List list() throws SQLException {
		return professor.list();
	}
	@PostMapping(value = "/post/professor")
	public ResponseEntity createProfessor(@RequestBody Professor prof) throws SQLException {
		professor.create(prof);
		return new ResponseEntity(professor, HttpStatus.OK);
	}
	
	@PostMapping(value = "/post/professorGrade")
	public ResponseEntity addGrade(@RequestBody Course c) throws SQLException {
		course.create(c);
		return new ResponseEntity(course, HttpStatus.OK);
	}
	
	@RequestMapping(value="/professor/{id,id1}",method=RequestMethod.GET)
	public ResponseEntity viewEnrolledStudnets(@PathVariable("id") int id,@PathVariable("id1") int id1) throws SQLException {
		Course courseId=course.getCourseCode(id);
		Student studentId=student.getId(id1);
		if (studentId == null) {
			return new ResponseEntity("No Student found with ID " + id, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(studentId, HttpStatus.OK);
	}

}
