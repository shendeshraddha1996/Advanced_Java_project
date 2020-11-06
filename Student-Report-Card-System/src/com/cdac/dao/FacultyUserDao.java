package com.cdac.dao;

import com.cdac.dto.FacultyUser;

public interface FacultyUserDao {
	void insertUser(FacultyUser facultyUser);
	boolean checkUser(FacultyUser facultyUser);
	String forgotPassword(String facultyemailId);
}
