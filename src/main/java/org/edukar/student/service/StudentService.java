package org.edukar.student.service;

import java.util.Optional;

import org.edukar.student.dto.StudentDto;
import org.edukar.student.dto.mapper.StudentMapper;
import org.edukar.student.model.Student;
import org.edukar.student.repository.StudentRemarkRepository;
import org.edukar.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private StudentRemarkRepository studentRemarkRepository;
	
	public Integer saveRecord(StudentDto studentDto) {
		Student saved = studentRepository.save(StudentMapper.mapStudentDtoToStudent(studentDto));
		saveRemarks(studentDto);
		return saved.getId();
	}
	
	private void saveRemarks(StudentDto studentDto) {
		if(studentDto.getIndicator() != null || studentDto.getCode() != null || studentDto.getRequiredInformation() != null)
			studentRemarkRepository.save(StudentMapper.mapStudentDtoToStudentRemark(studentDto));
	}

	public Student getRecord(Integer id) {
		Optional<Student> studentResult = studentRepository.findById(id);
		if(studentResult.isPresent())
			return studentResult.get();
		return null;
	}
}
