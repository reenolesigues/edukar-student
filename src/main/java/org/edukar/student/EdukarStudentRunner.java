package org.edukar.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class EdukarStudentRunner {

	public static void main(String[] args) {
//		log.info("Student Microservice Running...");
		SpringApplication springApplication = new SpringApplication(EdukarStudentRunner.class);
		springApplication.addListeners(new ApplicationPidFileWriter());
		springApplication.run();
	}
}
