package org.edukar.student.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	private String remarks;
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", nameExtension=" + nameExtension + ", sex=" + sex + ", birthday=" + birthday + ", age="
				+ age + ", religiousAffiliation=" + religiousAffiliation + ", houseNumber=" + houseNumber + ", street="
				+ street + ", barangay=" + barangay + ", municiality=" + municiality + ", province=" + province
				+ ", fatherFullName=" + fatherFullName + ", motherFullMaidenName=" + motherFullMaidenName
				+ ", guardianFullName=" + guardianFullName + ", guardianRelationship=" + guardianRelationship
				+ ", relativeContactNumber=" + relativeContactNumber + ", remarks=" + remarks + ", getId()=" + getId()
				+ ", getFirstName()=" + getFirstName() + ", getMiddleName()=" + getMiddleName() + ", getLastName()="
				+ getLastName() + ", getNameExtension()=" + getNameExtension() + ", getSex()=" + getSex()
				+ ", getBirthday()=" + getBirthday() + ", getAge()=" + getAge() + ", getReligiousAffiliation()="
				+ getReligiousAffiliation() + ", getHouseNumber()=" + getHouseNumber() + ", getStreet()=" + getStreet()
				+ ", getBarangay()=" + getBarangay() + ", getMuniciality()=" + getMuniciality() + ", getProvince()="
				+ getProvince() + ", getFatherFullName()=" + getFatherFullName() + ", getMotherFullMaidenName()="
				+ getMotherFullMaidenName() + ", getGuardianFullName()=" + getGuardianFullName()
				+ ", getGuardianRelationship()=" + getGuardianRelationship() + ", getRelativeContactNumber()="
				+ getRelativeContactNumber() + ", getRemarks()=" + getRemarks() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
//	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "student")
//	private StudentRemark studentRemark; 
}
