package com.example.teacherstudent.TeacherStudent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TeacherStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeacherStudentApplication.class, args);
	}

}
