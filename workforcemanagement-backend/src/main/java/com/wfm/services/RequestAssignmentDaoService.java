package com.wfm.services;

import java.util.List;

import com.wfm.models.ResAssignmentReq;

public interface RequestAssignmentDaoService {
	
	
	public boolean raiseRequest(ResAssignmentReq rqObj);
	public List<ResAssignmentReq> getAllRequest();

}
