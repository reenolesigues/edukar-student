package org.edukar.student.dto.mapper;

import org.edukar.student.dto.StudentDto;
import org.edukar.student.model.Student;
import org.edukar.student.model.StudentRemark;

public class StudentMapper {

	public static Student mapStudentDtoToStudent(StudentDto studentDto) {
		Student s = new Student();
		s.setFirstName(studentDto.getFirstName());
		s.setMiddleName(studentDto.getMiddleName());
		s.setLastName(studentDto.getLastName());
		s.setNameExtension(studentDto.getNameExtension());
		
		s.setBirthday(studentDto.getBirthday());
		s.setAge(studentDto.getAge());
		s.setSex(studentDto.getSex());
		
		s.setBarangay(studentDto.getBarangay());
		s.setHouseNumber(studentDto.getHouseNumber());
		s.setMuniciality(studentDto.getMuniciality());
		s.setProvince(studentDto.getProvince());
		s.setReligiousAffiliation(studentDto.getReligiousAffiliation());
		
		s.setFatherFullName(studentDto.getFatherFullName());
		s.setMotherFullMaidenName(studentDto.getMotherFullMaidenName());
		s.setGuardianFullName(studentDto.getGuardianFullName());
		s.setRelativeContactNumber(studentDto.getRelativeContactNumber());
		return s;
	}
	
	public static StudentRemark mapStudentDtoToStudentRemark(StudentDto studentDto) {
		StudentRemark r = new StudentRemark();
		r.setCode(studentDto.getCode());
		r.setIndicator(studentDto.getIndicator());
		r.setRequiredInformation(studentDto.getRequiredInformation());
		return r;
	}
}
