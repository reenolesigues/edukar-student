package org.edukar.student.controller;

import org.edukar.student.dto.StudentDto;
import org.edukar.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String postStudent(@RequestBody StudentDto studentDto) {
		return studentService.saveRecord(studentDto).getId().toString();
	}
}
