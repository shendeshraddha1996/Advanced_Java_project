package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.FacultyUserDao;
import com.cdac.dto.FacultyUser;

@Service
public class FacultyUserServiceImple implements FacultyUserService{

	@Autowired
	private FacultyUserDao facultyUserDao;
	
	@Override
	public void addUser(FacultyUser facultyUser) {
		
		 facultyUserDao.insertUser( facultyUser);
	}

	@Override
	public boolean findUser(FacultyUser facultyUser) {
	
		return facultyUserDao.checkUser( facultyUser);
	}

	@Override
	public String forgotPassword(String facultyemailId) {
		
		return facultyUserDao.forgotPassword(facultyemailId);
	}

}
