package com.statusBook.Attendence.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="attendence")
public class Attendence {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="status")
	private String status;
	public Attendence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Attendence(String status) {
		super();
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Attendence [id=" + id + ", status=" + status + "]";
	}
	
	
	
}
