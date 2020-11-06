package com.cdac.dao;

import java.util.List;

import com.cdac.dto.RecordData;



public interface RecordDao {
	void insertRecord(RecordData record);
	 void deleteRecord(int rollno );
	 RecordData selectRecord(int rollno);
	 void updateRecord(RecordData record);
	 List<RecordData> selectAll(int facultyUserId);
	 List<RecordData> studentSelectAll(int rollno,int facultyUserId);
}
