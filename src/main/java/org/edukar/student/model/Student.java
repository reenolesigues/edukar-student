package org.edukar.student.model;

import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Student", schema = "edukar_student")
@Getter
@Setter
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "StudentIDGenerator")
	@SequenceGenerator(name = "StudentIDGenerator", sequenceName = "edukar_student.student_id_sequence")
	private Integer id;
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String nameExtension;
	
	private Character sex;
	private GregorianCalendar birthday;
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
	
	@OneToOne(mappedBy = "student")
	private StudentRemark studentRemark; 
}
