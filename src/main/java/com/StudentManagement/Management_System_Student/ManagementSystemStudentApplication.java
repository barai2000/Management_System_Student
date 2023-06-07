package com.StudentManagement.Management_System_Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.StudentManagement.Management_System_Student.controller")
@EnableJpaRepositories(basePackages = "com.StudentManagement.Management_System_Student.repository")
@EntityScan(basePackages = "com.StudentManagement.Management_System_Student.entities")
public class ManagementSystemStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagementSystemStudentApplication.class, args);
	}

}
