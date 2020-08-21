package org.edukar.student.service;

import java.util.Optional;

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
	
	public Student patchRecord(Integer id, StudentDto studentDto) throws Exception {
		Optional<Student> s = studentRepository.findById(id);
		if(s.isEmpty()) {
			throw new Exception("Unable to find student to patch record with id " + id);
		}
		Student student = StudentMapper.mapStudentDtoToExistingStudent(studentDto, s.get());
		return studentRepository.save(student);
	}

	public Student getRecord(Integer id) {
		Optional<Student> studentResult = studentRepository.findById(id);
		if(studentResult.isPresent())
			return studentResult.get();
		return null;
	}

	public void deleteRecord(Integer id) {
		studentRepository.deleteById(id);
	}

	
}
