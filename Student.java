package com.statusBook.Attendence.Common;

public class Student {
	
	private int id;
	
	private String studentname;
	
	private String rollno;
	
	private Teacher teacher;
	
	private String attendenceStatus;
	
	public String getAttendenceStatus() {
		return attendenceStatus;
	}

	public void setAttendenceStatus(String attendenceStatus) {
		this.attendenceStatus = attendenceStatus;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String studentname, String rollno) {
		super();
		this.studentname = studentname;
		this.rollno = rollno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentname=" + studentname + ", rollno=" + rollno + "]";
	}
	
	
	
}
