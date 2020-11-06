package com.cdac.service;

import com.cdac.dto.FacultyUser;

public interface FacultyUserService {
	void addUser(FacultyUser facultyUser);
	boolean findUser(FacultyUser facultyUser);
	String forgotPassword(String facultyemailId);
}
