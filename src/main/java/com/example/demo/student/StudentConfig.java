package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {

            Student rituraj = new Student(
			"Rituraj Singh", "riturajsingh2015@gmail.com", LocalDate.of(1989, Month.JUNE, 11)
			);

            Student yudhvir = new Student(
			"Yudhvir Singh", "yudhvirsingh1607@gmail.com", LocalDate.of(1991, Month.DECEMBER, 16)
			);

            Student mummy = new Student(
			"Jagjeet Kaur", "jagjeetkaur0303@gmail.com", LocalDate.of(1964, Month.AUGUST, 19)
			);

            repository.saveAll(
                List.of(rituraj,yudhvir,mummy)            
            );
            

        };
    }
}
