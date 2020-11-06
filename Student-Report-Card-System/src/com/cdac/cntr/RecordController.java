package com.cdac.cntr;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.cdac.dto.FacultyUser;
import com.cdac.dto.RecordData;

import com.cdac.service.RecordService;

@Controller
public class RecordController {
		@Autowired
		private RecordService recordService ;
		@RequestMapping(value = "/prep_record_add_form.com",method = RequestMethod.GET)
		public String prepRecordAddForm(ModelMap map,HttpSession session,HttpServletResponse r) throws IOException {
//			boolean t=checkSessionStudent(session,r);
//			if(!t) {
//				return "index";
//			}
			map.put("record", new RecordData());
			return "record_add_form";
		}
		//logout
		public static boolean checkSessionStudent(HttpSession hs,HttpServletResponse r) throws IOException {
			Object s1 =  hs.getAttribute("facultyUser");
			System.out.println(s1);
			if(s1==null) {
				System.out.println("error");
				r.sendRedirect("./");	
				return false;
			}
			return true;
			
		}

		@RequestMapping(value = "/record_add.com",method = RequestMethod.POST)
		public String RecordAdd(RecordData record,HttpSession session,HttpServletResponse r) throws IOException {
			
			int facultyUserId=((FacultyUser)session.getAttribute("facultyUser")).getFacultyUserId();
			record.setFaculty_user_id(facultyUserId);
			recordService.addRecord(record);
			return "home";
		}
		
		@RequestMapping(value = "/record_list.com",method = RequestMethod.GET)
		public String allRecordList(ModelMap map,HttpSession session,HttpServletResponse r) throws IOException {
			boolean t=checkSessionStudent(session,r);
			if(!t) {
				return "index";
			}
			System.out.println(t);
			int facultyUserId=((FacultyUser)session.getAttribute("facultyUser")).getFacultyUserId();
			List<RecordData>li=recordService.selectAll(facultyUserId);
			map.put("recordList",li);
			return "record_list";
		}
		
		@RequestMapping(value = "/record_delete.com",method = RequestMethod.GET)
		public String deleteExpenseList(@RequestParam int rollno,ModelMap map,HttpSession session) {
			recordService.removeRecord(rollno);
			int facultyUserId=((FacultyUser)session.getAttribute("facultyUser")).getFacultyUserId();
			List<RecordData>li=recordService.selectAll(facultyUserId);
			map.put("recordList",li);
			return "record_list";
		}
		
		@RequestMapping(value = "/record_update_form.com",method = RequestMethod.GET)
		public String updateRecordForm(@RequestParam int rollno,ModelMap map,HttpServletResponse r,HttpSession session) throws IOException {
			boolean t=checkSessionStudent(session,r);
			if(!t) {
				return "index";
			}
			RecordData re=recordService.findRecord(rollno);
			map.put("record",re);
			return "record_update_form";
		}
		
		@RequestMapping(value = "/update_data.com",method = RequestMethod.POST)
		public String expenseUpdate(RecordData recordData,ModelMap map,HttpServletResponse r,HttpSession session) throws IOException {
			boolean t=checkSessionStudent(session,r);
			if(!t) {
				return "index";
			}
			recordService.modifyRecord(recordData);
			int facultyUserId=((FacultyUser)session.getAttribute("facultyUser")).getFacultyUserId();
			List<RecordData>li=recordService.selectAll(facultyUserId);
			map.put("recordList",li);
			return "record_list";
		}
		
		@RequestMapping(value="/student_login_form.com",method = RequestMethod.GET)
		public String prepStudentLoginForm(ModelMap map) {
			map.put("record", new RecordData());
			return "student_login_form";
			
		}
		
		@RequestMapping(value="/student_login.com",method = RequestMethod.POST)
		public String studentLogin(RecordData recordData,ModelMap map,HttpSession session,HttpServletRequest request) {
			RecordData b=recordService.findRecord(recordData.getRollno());
			System.out.println(b.getRollno());
			if(b!=null) {
				List<RecordData>li=recordService.studentSelectAll(b.getRollno(),b.getFaculty_user_id());
				map.put("recordList",li);
				return "student_home_page";
			}
			return "index";
			
		}

}	
