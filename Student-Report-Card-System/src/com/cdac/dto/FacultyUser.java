package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="faculty_user")
public class FacultyUser {
	@Id
	@GeneratedValue
	@Column(name="faculty_id")
	private int facultyUserId;
	@Column(name="faculty_user_name")
	private String facultyUserName;
	@Column(name="faculty_email_id")
	private String facultyemailId;
	@Column(name="faculty_user_pass")
	private String facultyUserPass;
	public FacultyUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getFacultyUserId() {
		return facultyUserId;
	}
	public void setFacultyUserId(int facultyUserId) {
		this.facultyUserId = facultyUserId;
	}
	public String getFacultyUserName() {
		return facultyUserName;
	}
	public void setFacultyUserName(String facultyUserName) {
		this.facultyUserName = facultyUserName;
	}
	public String getFacultyemailId() {
		return facultyemailId;
	}
	public void setFacultyemailId(String facultyemailId) {
		this.facultyemailId = facultyemailId;
	}
	public String getFacultyUserPass() {
		return facultyUserPass;
	}
	public void setFacultyUserPass(String facultyUserPass) {
		this.facultyUserPass = facultyUserPass;
	}
	public FacultyUser(int facultyUserId) {
		super();
		this.facultyUserId = facultyUserId;
	}
	public FacultyUser(String facultyUserName) {
		super();
		this.facultyUserName = facultyUserName;
	}

	
}
