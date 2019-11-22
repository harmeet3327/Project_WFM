package com.wfm.dao;

import java.util.List;

import com.wfm.models.ResAssignmentReq;


public interface RequestAssignmentDao {
	
	public boolean raiseRequest(ResAssignmentReq rqObj);
	public List<ResAssignmentReq> getAllRequest();

}
