package com.example.teacherstudent.TeacherStudent.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.teacherstudent.TeacherStudent.Entity.Student;
import com.example.teacherstudent.TeacherStudent.Service.TeacherStudentService;

import java.util.List;

@RestController
@RequestMapping("/TeacherStudent")
public class TeacherStudentController {
	@Autowired
	private TeacherStudentService service;
	
	@PostMapping("/student")
	public Student addStudents(@RequestBody Student student) {
		return service.addStudent(student);
	}
	
	@GetMapping("/getStudent")
	public List<Student> getAllStudents(){
		return service.getAllStudent();
	}
	
}
