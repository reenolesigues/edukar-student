package org.edukar.student.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "StudentRemark", schema = "edukar")
@Getter
@Setter
public class StudentRemark {

	@Id
	private Integer id;
	
//	@OneToOne(orphanRemoval = true, cascade = CascadeType.ALL, targetEntity = Student.class)
//	private Integer studentId;
	
	private String indicator;
	private String code;
	private String requiredInformation;
	
}
