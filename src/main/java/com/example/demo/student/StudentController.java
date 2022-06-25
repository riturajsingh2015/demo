package com.example.demo.student;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {  // Acts as API layer , it will have reference of Service layer
    
    private final StudentService studentService;  // To automatically intialize this service we use dependency injection

    // i.e without creating an instance of the service we auto-wire it to itself
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
	public List<Student> getStudents(){
		return studentService.getStudents();        
	}

    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
    studentService.addNewStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudentById(@PathVariable("studentId") Long studentId){
        studentService.deleteStudent(studentId);
    }
}
