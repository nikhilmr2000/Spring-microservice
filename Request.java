package com.statusBook.Attendence.Common;

import com.statusBook.Attendence.Entity.Attendence;

public class Request {
	private Student student;
	private Attendence attendence;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Attendence getAttendence() {
		return attendence;
	}
	public void setAttendence(Attendence attendence) {
		this.attendence = attendence;
	}
	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Request(Student student, Attendence attendence) {
		super();
		this.student = student;
		this.attendence = attendence;
	}
	@Override
	public String toString() {
		return "Request [student=" + student + ", attendence=" + attendence + "]";
	}
	
	
	
}
