package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.RecordDao;
import com.cdac.dto.RecordData;

@Service
public class RecordServiceImple implements RecordService {
		
	@Autowired
	private RecordDao recordDao;
	
	@Override
	public void addRecord(RecordData record) {
		
		System.out.println("entered recordserviceimple");
		recordDao.insertRecord(record);
	}

	@Override
	public void removeRecord(int rollno) {
		recordDao.deleteRecord(rollno);
		
	}

	@Override
	public void modifyRecord(RecordData record) {
	
		recordDao.updateRecord(record);
	}

	@Override
	public List<RecordData> selectAll(int facultyUserId) {
		
		return recordDao.selectAll(facultyUserId);
	}

	@Override
	public RecordData findRecord(int rollno) {
		
		return recordDao.selectRecord(rollno);
	}

	@Override
	public List<RecordData> studentSelectAll(int rollno,int facultyUserId) {
		
		return recordDao.studentSelectAll(rollno,facultyUserId);
	}

	

}
