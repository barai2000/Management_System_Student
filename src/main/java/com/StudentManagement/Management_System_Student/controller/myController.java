package com.StudentManagement.Management_System_Student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.StudentManagement.Management_System_Student.entities.Student;
import com.StudentManagement.Management_System_Student.repository.studentRepository;

@RestController
public class myController 
{
	@Autowired
	studentRepository sr;
	
	//save the data
	@PostMapping("/saveData")
	public String savedata(@RequestBody Student s)
	{
		sr.save(s);
		return "Saved Data.";
	}
	
	//fetch all data
	@GetMapping("/fetchAllData")
	public List<Student> fetchalldata()
	{
		List<Student> studall=sr.findAll();
		return studall;
	}
	
	//fetch data by id
	@GetMapping("/fetchById")
	public Student fetchById(@RequestParam int id)
	{
		Optional<Student> o=sr.findById(id);
		Student studs=o.get();
		return studs;
	}
	
	//update the data
	@PutMapping("/updateData")
	public String updateData(@RequestBody Student s)
	{
		sr.save(s);
		return "Data Updated.";
	}
	
	//delete the data
	@DeleteMapping("/deleteData")
	public String deleteData(@RequestParam int id)
	{
		sr.deleteById(id);
		return "Data Deleted.";
	}

	//fetch by name
	@GetMapping("/fetchByName")
	public List<Student> findByName(@RequestParam String name)
	{
		return sr.findByName(name);
		 
	}
	
	//fetch by email and password //login validation
	@GetMapping("/fetchByEmailAndPassword")
	public Student fetchByEmailAndPassword(@RequestBody Student s)
	{
		return sr.findByEmailAndPassword(s.getEmail(), s.getPassword());
	}
}
