package com.example.demo;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.student.Student;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<Student> hello(){
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
