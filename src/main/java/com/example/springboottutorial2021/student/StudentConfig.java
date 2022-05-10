package com.example.springboottutorial2021.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student mati = new Student(
					"Mati",
					"mati.chudek@op.pl",
					LocalDate.of(2001, Month.JUNE, 26)
			);
			Student mati2 = new Student(
					"Mati2",
					"mati2@op.pl",
					LocalDate.of(2000, Month.JUNE, 26)
			);
			Student mati3 = new Student(
					"Mati3",
					"mati3@op.pl",
					LocalDate.of(1999, Month.JUNE, 26)
			);

			repository.saveAll(
					List.of(mati, mati2, mati3)
			);
		};
	}
}
