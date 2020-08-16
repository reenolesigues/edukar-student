package org.edukar.student.service;

import java.util.Optional;

import org.edukar.student.dto.StudentDto;
import org.edukar.student.dto.mapper.StudentMapper;
import org.edukar.student.model.Student;
import org.edukar.student.model.StudentRemark;
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
		Student savedStudent = studentRepository.save(StudentMapper.mapStudentDtoToStudent(studentDto));
		saveRemarks(savedStudent, studentDto);
		return savedStudent.getId();
	}
	
	public Integer patchRecord(Integer id, StudentDto studentDto) throws Exception {
		Optional<Student> s = studentRepository.findById(id);
		if(s.isEmpty()) {
			throw new Exception("Unable to find student to patch record with id " + id);
		}
		Student student = StudentMapper.mapStudentDtoToExistingStudent(studentDto, s.get());
		studentRepository.save(student);
		StudentRemark r = StudentMapper.mapStudentDtoToExistingStudentRemark(studentDto, student.getStudentRemark());
		if(r != null)
			studentRemarkRepository.save(r);
		return student.getId();
	}
	
	private void saveRemarks(Student savedStudent, StudentDto studentDto) {
		if(savedStudent != null && studentDto.getIndicator() != null || studentDto.getCode() != null || studentDto.getRequiredInformation() != null) {
			StudentRemark studentRemark = StudentMapper.mapStudentDtoToStudentRemark(studentDto);
			studentRemark.setStudent(savedStudent);
			studentRemarkRepository.save(studentRemark);
		}
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
