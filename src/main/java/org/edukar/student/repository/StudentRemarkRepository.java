package org.edukar.student.repository;

import org.edukar.student.model.StudentRemark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRemarkRepository extends JpaRepository<StudentRemark, Integer>{

}
