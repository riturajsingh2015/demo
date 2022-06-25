package com.example.demo.student;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService { // Acts as Service layer which implements the business logic

	private final StudentRepository studentRepository;

	
@Autowired
public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}



	// Since this is auto-wired it is mandatory to declare it as a "Component" or a "Service"
    public List<Student> getStudents(){
		return studentRepository.findAll();
	}
}
