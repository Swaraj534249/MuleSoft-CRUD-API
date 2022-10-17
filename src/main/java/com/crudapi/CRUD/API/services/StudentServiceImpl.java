package com.crudapi.CRUD.API.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudapi.CRUD.API.dao.StudentDao;
import com.crudapi.CRUD.API.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

//	List<Student> list;

	@Autowired
	private StudentDao studentDao;

	public StudentServiceImpl() {

	}

	@Override
	public List<Student> getStudents() {
		return studentDao.findAll();
	}

	@Override
	public Student getStudent(long rollNo) {
		return studentDao.findById(rollNo).get();
	}

	@Override
	public Student addStudent(Student student) {
		studentDao.save(student);
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		studentDao.save(student);
		return student;
	}

	@Override
	public void deleteStudent(long rollNo) {
		Student student = studentDao.getOne(rollNo);
		studentDao.delete(student);

	}

}
