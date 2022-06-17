package com.example.demo.student;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    
    @GetMapping
	public List<Student> getStudents(){
		return List.of(
			new Student(
				1L, "Rituraj Singh", "riturajsingh2015@gmail.com", LocalDate.of(1989, Month.FEBRUARY, 10), 33
			),
			new Student(
				2L, "Yudhvir Singh", "yudhvirsingh1607@gmail.com", LocalDate.of(1991, Month.JULY, 16), 31
			)
		);
	}
}
