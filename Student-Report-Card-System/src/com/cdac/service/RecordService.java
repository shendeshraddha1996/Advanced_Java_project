package com.cdac.service;

import java.util.List;

import com.cdac.dto.RecordData;



public interface RecordService {
	void addRecord(RecordData record);
	 void removeRecord(int rollno );
	 RecordData findRecord(int rollno);
	 void modifyRecord(RecordData record);
	 List<RecordData> selectAll(int facultyUserId);
	 List<RecordData> studentSelectAll(int rollno,int facultyUserId);
	 
}
