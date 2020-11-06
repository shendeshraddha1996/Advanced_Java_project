package com.cdac.valid;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cdac.dto.FacultyUser;



@Service
public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(FacultyUser.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "facultyUserName","unmKey", "*user name required*");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "facultyUserPass", "passKey","*password required*");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "facultyemailId", "emailId","*email id required*");
		FacultyUser user = (FacultyUser)target;
//		if(user.getFacultyUserPass()!=null) {
//			if(user.getFacultyUserPass().length()<5) { 
//				errors.rejectValue("facultyUserPass", "passKey", "password should contain more than 5 characters");
//			}
//		}
		
		
	}
	
}
