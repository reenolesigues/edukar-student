package org.edukar.student.service;

import org.edukar.student.dto.StudentDto;
import org.edukar.student.dto.mapper.StudentMapper;
import org.edukar.student.model.Student;
import org.edukar.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public Student saveRecord(StudentDto studentDto) {
		return studentRepository.save(StudentMapper.mapStudentDtoToStudent(studentDto));
	}
}
