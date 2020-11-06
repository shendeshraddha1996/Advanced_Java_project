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


import com.cdac.dto.RecordData;
@Repository
public class RecordDaoImple implements RecordDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void insertRecord(RecordData record) {

		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr=session.beginTransaction();
				session.save(record);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}

	@Override
	public void deleteRecord(int rollno) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr=session.beginTransaction();
				session.delete(new RecordData(rollno));
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}

	@Override
	public void updateRecord(RecordData record) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr=session.beginTransaction();
				RecordData rd=(RecordData)session.get(RecordData.class,record.getRollno());
				rd.setStudentName(record.getStudentName());
				rd.setMaths(record.getMaths());
				rd.setPhysics(record.getPhysics());
				rd.setEnglish(record.getEnglish());
				
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}

	@Override
	public List<RecordData> selectAll(int facultyUserId) {
		List<RecordData> recordList=hibernateTemplate.execute(new HibernateCallback<List<RecordData>>() {

			@Override
			public List<RecordData> doInHibernate(Session session) throws HibernateException {
				Transaction tr=session.beginTransaction();
				Query q=session.createQuery("from RecordData where faculty_user_id=?");
				q.setInteger(0,facultyUserId);
				List<RecordData> li=q.list();
				System.out.println(li);
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
			
		});
		return recordList;
	}

	@Override
	public RecordData selectRecord(int rollno) {
		
		RecordData recordData=hibernateTemplate.execute(new HibernateCallback<RecordData>() {

			@Override
			public RecordData doInHibernate(Session session) throws HibernateException {
				Transaction tr=session.beginTransaction();
				RecordData rc=(RecordData)session.get(RecordData.class,rollno);
				tr.commit();
				session.flush();
				session.close();
				return rc;
			}
			
		});
			return recordData;
	}

	@Override
	public List<RecordData> studentSelectAll(int rollno,int facultyUserId) {
		List<RecordData> recordList=hibernateTemplate.execute(new HibernateCallback<List<RecordData>>() {

			@Override
			public List<RecordData> doInHibernate(Session session) throws HibernateException {
				Transaction tr=session.beginTransaction();
				Query q=session.createQuery("from RecordData where rollno=? and faculty_user_id=? ");
				q.setInteger(0,rollno);
				q.setInteger(1, facultyUserId);
				List<RecordData> li=q.list();
				System.out.println(li);
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
			
		});	
		return recordList;
	}

		
}


