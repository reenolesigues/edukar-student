package org.edukar.student.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDto {

	private String firstName;
	private String middleName;
	private String lastName;
	private String nameExtension;
	
	private char sex;
	private Date birthday;
	private Integer age;
	
	private String religiousAffiliation;
	
	private String houseNumber;
	private String street;
	private String barangay;
	private String municiality;
	private String province;
	
	private String fatherFullName;
	private String motherFullMaidenName;
	private String guardianFullName;
	private String guardianRelationship;
	private String relativeContactNumber;
	
	private String indicator;
	private String code;
	private String requiredInformation;
	
}
