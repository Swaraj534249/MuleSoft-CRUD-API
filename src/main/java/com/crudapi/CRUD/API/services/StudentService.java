package com.crudapi.CRUD.API.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.crudapi.CRUD.API.model.Student;

public interface StudentService {

	public List<Student> getStudents();
	
	public Student getStudent(long rollNo);
	
	public Student addStudent(Student student);
	
	public Student updateStudent(Student student);
	
	public void deleteStudent( long rollNo);
}
