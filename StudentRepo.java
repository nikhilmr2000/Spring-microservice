package com.example.teacherstudent.TeacherStudent.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.teacherstudent.TeacherStudent.Entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{
	
}
