package com.crudapi.CRUD.API.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudapi.CRUD.API.model.Student;

public interface StudentDao extends JpaRepository<Student, Long> {

	
}
