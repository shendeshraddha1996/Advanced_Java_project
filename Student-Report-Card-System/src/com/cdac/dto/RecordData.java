package com.cdac.dto;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="record_data")
public class RecordData {
	@Id
	private int rollno;
	private String studentName;
	private String maths;
	private String physics;
	private String english;
	private int faculty_user_id;
	public RecordData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getMaths() {
		return maths;
	}
	public void setMaths(String maths) {
		this.maths = maths;
	}
	public String getPhysics() {
		return physics;
	}
	public void setPhysics(String physics) {
		this.physics = physics;
	}
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public int getFaculty_user_id() {
		return faculty_user_id;
	}
	public void setFaculty_user_id(int faculty_user_id) {
		this.faculty_user_id = faculty_user_id;
	}
	public RecordData(int rollno) {
		super();
		this.rollno = rollno;
	}
	
}
