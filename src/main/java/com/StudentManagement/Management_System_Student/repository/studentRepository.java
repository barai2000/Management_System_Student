package com.StudentManagement.Management_System_Student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentManagement.Management_System_Student.entities.Student;

public interface studentRepository extends JpaRepository<Student, Integer> 
{
	//fetchbyname
	public List<Student> findByName(String name);
	
	//fetchbyemailandpassword
	//login validation
	public Student findByEmailAndPassword(String email,String password);

}
