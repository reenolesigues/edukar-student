package org.edukar.student.dto.mapper;

import org.edukar.student.dto.StudentDto;
import org.edukar.student.model.Student;
import org.modelmapper.ModelMapper;

public class StudentMapper {

	public static Student mapStudentDtoToStudent(StudentDto studentDto) {
		ModelMapper mapper = new ModelMapper();
		Student s = mapper.map(studentDto, Student.class);
		return s;
	}
	
	public static Student mapStudentDtoToExistingStudent(StudentDto studentDto, Student student) {
		student.setAge(studentDto.getAge());
		return student;
	}
}
