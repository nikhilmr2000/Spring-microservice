package com.example.teacherstudent.TeacherStudent.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teacherstudent.TeacherStudent.Entity.Student;
import com.example.teacherstudent.TeacherStudent.Repository.StudentRepo;

import java.util.List;

@Service
public class TeacherStudentService {
	@Autowired
	private StudentRepo repo;
	
	public Student addStudent(Student student) {
		return repo.save(student);
	}
	
	public List<Student> getAllStudent() {
		List<Student> getAll=repo.findAll();
		return getAll;
	}
	
}
