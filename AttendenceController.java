package com.statusBook.Attendence.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.statusBook.Attendence.Common.Request;
import com.statusBook.Attendence.Entity.Attendence;
import com.statusBook.Attendence.Service.AttendenceService;

@RestController
@RequestMapping("/attendence")
public class AttendenceController {
	@Autowired
	AttendenceService service;
	
	@PostMapping("/addAttendence")
	public ResponseEntity<?> addAttend(@RequestBody Request request) {
		service.addAttendence(request);
		if(service.addAttendence(request)==null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok().build();
	}
	
	
}
