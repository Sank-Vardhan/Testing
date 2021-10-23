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

}
