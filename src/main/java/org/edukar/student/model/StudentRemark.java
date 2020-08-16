package org.edukar.student.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	
	/*Note: Use @JsonIgnore to avoid printing the object in an endless loop*/
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id", referencedColumnName = "id", insertable = true, updatable = false, nullable = false)
	@JsonIgnore
	private Student student;
	
	private String indicator;
	private String code;
	private String requiredInformation;
}
