package com.cdac.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cdac.dto.FacultyUser;

@Repository
public class FacultyUserDaoImple implements FacultyUserDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void insertUser(FacultyUser facultyUser) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(facultyUser);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}

	@Override
	public boolean checkUser(FacultyUser facultyUser) {
		
		boolean b=hibernateTemplate.execute(new HibernateCallback<Boolean>() {

			@Override
			public Boolean doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from FacultyUser where facultyUserName = ? and facultyUserPass = ?");
				q.setString(0, facultyUser.getFacultyUserName());
				q.setString(1, facultyUser.getFacultyUserPass());
				List<FacultyUser> li = q.list();
				if(li.isEmpty()) {
					return false;
					
				}else {
					facultyUser.setFacultyUserId(li.get(0).getFacultyUserId());
					boolean flag = !li.isEmpty();
					tr.commit();
					session.flush();
					session.close();
					return flag;
				}
				
			}
			
		});
		
		return b;
	}

	@Override
	public String forgotPassword(String facultyemailId) {
		
		String password = hibernateTemplate.execute(new HibernateCallback<String>() {

			@Override
			public String doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from FacultyUser where facultyemailId = ?");
				q.setString(0, facultyemailId);
				List<FacultyUser> li = q.list();
				String pass = null;
				if(!li.isEmpty())
					pass = li.get(0).getFacultyUserPass();
				tr.commit();
				session.flush();
				session.close();
				return pass;
			}
			
		});
		return password;
	}
	}

