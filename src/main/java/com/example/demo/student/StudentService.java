package com.example.demo.student;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService { // Acts as Service layer which implements the business logic
// Since this is auto-wired it is mandatory to declare it as a "Component" or a "Service"
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
