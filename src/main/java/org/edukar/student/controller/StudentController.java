package org.edukar.student.controller;

import org.edukar.student.dto.StudentDto;
import org.edukar.student.model.Student;
import org.edukar.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Student postStudent(@RequestBody StudentDto studentDto) {
		return studentService.saveRecord(studentDto);
	}
	
	@PatchMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Student patchStudent(@PathVariable(required = true, name = "id") Integer id, @RequestBody StudentDto studentDto) throws Exception {
		return studentService.patchRecord(id, studentDto);
	}
	
	@GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Student getStudent(@PathVariable(required = true, name = "id") Integer id) {
		return studentService.getRecord(id);
	}
	
	@DeleteMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteStudent(@PathVariable(required = true, name = "id") Integer id) {
		studentService.deleteRecord(id);
	}
}
