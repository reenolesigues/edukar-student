package org.edukar.student.dto.mapper;

import org.edukar.student.dto.StudentDto;
import org.edukar.student.model.Student;
import org.edukar.student.model.StudentRemark;
import org.modelmapper.ModelMapper;

public class StudentMapper {

	public static Student mapStudentDtoToStudent(StudentDto studentDto) {
		ModelMapper mapper = new ModelMapper();
		Student s = mapper.map(studentDto, Student.class);
		return s;
	}
	
	public static Student mapStudentDtoToExistingStudent(StudentDto studentDto, Student student) {
		ModelMapper mapper = new ModelMapper();
		Student s = mapper.map(studentDto, Student.class);
		s.setId(s.getId());
		return s;
	}
	
	public static StudentRemark mapStudentDtoToStudentRemark(StudentDto studentDto) {
		ModelMapper mapper = new ModelMapper();
		StudentRemark r = mapper.map(studentDto, StudentRemark.class);
		return r;
	}
	
	public static StudentRemark mapStudentDtoToExistingStudentRemark(StudentDto studentDto, StudentRemark studentRemark) {
		if(studentDto == null || studentRemark == null)
			return null;
		ModelMapper mapper = new ModelMapper();
		StudentRemark r = mapper.map(studentDto, StudentRemark.class);
		r.setId(studentRemark.getId());
		return r;
	}
}
