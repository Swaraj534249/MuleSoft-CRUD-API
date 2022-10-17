package com.crudapi.CRUD.API.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crudapi.CRUD.API.model.Student;
import com.crudapi.CRUD.API.services.StudentService;

@RestController
public class MyController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/home")
	public String home() {
		
		return "home";
	}

	@GetMapping("/students")
	public List<Student> getStudents(){		
		return this.studentService.getStudents();		
	}
	
	@GetMapping("/students/{rollNo}")
	public Student getStudent(@PathVariable String rollNo) {
		return this.studentService.getStudent(Long.parseLong(rollNo));
	}
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) {		
		return this.studentService.addStudent(student);
	}
	
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student) {		
		return this.studentService.updateStudent(student);
	}
	
	@DeleteMapping("/students/{rollNo}")
	public ResponseEntity<HttpStatus> deleteStudent(@PathVariable String rollNo){
		try {
			this.studentService.deleteStudent(Long.parseLong(rollNo));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}
