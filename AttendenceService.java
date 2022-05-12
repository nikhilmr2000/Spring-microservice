package com.statusBook.Attendence.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.statusBook.Attendence.Common.Request;
import com.statusBook.Attendence.Common.Student;
import com.statusBook.Attendence.Entity.Attendence;
import com.statusBook.Attendence.Repository.AttendenceRepo;

import java.util.List;

@Service
public class AttendenceService {
	@Autowired
	AttendenceRepo repo;
	
	@Autowired
	RestTemplate restTemplate;
	
	public Attendence addAttendence(Request request) {
		Student student=request.getStudent();
		Attendence attendence=request.getAttendence();
		student.setAttendenceStatus(attendence.getStatus());
		
		Student studentNew=restTemplate.postForObject("http://student-service/TeacherStudent/student",student,Student.class);
		
		repo.save(attendence);
		return attendence;
		
	}
		
}
