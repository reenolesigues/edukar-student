package org.edukar.student.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "StudentRemark", schema = "edukar_student")
@Getter
@Setter
public class StudentRemark {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "StudentRemarkGenerator")
	@SequenceGenerator(name = "StudentRemarkGenerator", sequenceName = "edukar_student.student_remark_sequence")
	private Integer id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id", referencedColumnName = "id")
	private Student student;
	
	private String indicator;
	private String code;
	private String requiredInformation;
}
