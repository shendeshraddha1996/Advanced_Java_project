package com.cdac.cntr;


import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.cdac.dto.FacultyUser;
import com.cdac.dto.RecordData;
import com.cdac.service.FacultyUserService;
import com.cdac.valid.UserValidator;



@Controller
public class FacultyUserController {
	@Autowired
	private FacultyUserService facultyUserService;
	
	@Autowired
	private UserValidator userValidator;
	
	@Autowired
	private MailSender mailSender;
	
	
	
	@RequestMapping(value = "/pre_reg_form.com",method = RequestMethod.GET)
	public String prepRegForm(ModelMap map) {
		map.put("facultyUser", new FacultyUser());
		return "reg_form";
	}
	
	@RequestMapping(value = "/prep_login_form.com",method = RequestMethod.GET)
	public String prepLogForm(ModelMap map) {
		map.put("facultyUser", new FacultyUser());
		return "login_form";
	}
	
	@RequestMapping(value = "/register.com",method = RequestMethod.POST)
	public String register(FacultyUser facultyUser,BindingResult result,ModelMap map) {
//		userValidator.validate(facultyUser, result);
//		if(result.hasErrors()) {
//			return "index";
//		}
		
		facultyUserService.addUser(facultyUser);
		return "index";
	}
	
	@RequestMapping(value = "/login.com",method = RequestMethod.POST)
	public String login(FacultyUser facultyUser,BindingResult result,ModelMap map,HttpSession session) {

		boolean b = facultyUserService.findUser(facultyUser);
		if(b) {
			session.setAttribute("facultyUser",facultyUser);
			return "home";
		}else {
			System.out.println("entered wrong loop");
			map.put("facultyUser", new FacultyUser());
			return "error_page";
		}
	}

	
	@RequestMapping(value = "/forgot_password.com",method = RequestMethod.POST)
	public String forgotPassword(@RequestParam String facultyemailId,ModelMap map) {		
		String pass = facultyUserService.forgotPassword(facultyemailId);
		String msg = "you are not registered";
		if(pass!=null) {	
			
			SimpleMailMessage message = new SimpleMailMessage();  
	        message.setFrom("cdacmumbai3@gmail.com");  
	        message.setTo(facultyemailId);  
	        message.setSubject("Your password");  
	        message.setText(pass);  
	        //sending message   
	        mailSender.send(message);
			msg = "check the mail for password";
		}
		map.put("msg", msg);
		return "index";
	}
	
//	public static boolean routeprotect(HttpSession session)
//	{
//		
//		Object obj = session.getAttribute("facultyUser");
//		if(obj == null)
//		{
//			return false;
//		}
//		return true;
//	}	
	
	
	@RequestMapping(value = "logout_here.com")
	public String LogoutHere(HttpSession session) {
		session.removeAttribute("facultyUser");
		session.invalidate();
		
		return "index";
	}
	
	
	

	
	
	
}
