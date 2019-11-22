package com.wfm.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wfm.dao.RequestAssignmentDao;
import com.wfm.models.ResAssignmentReq;
import com.wfm.services.RequestAssignmentDaoService;

@Service("reqService")
@Transactional
public class RequestAssignmentDaoImplService implements RequestAssignmentDaoService {

	@Autowired RequestAssignmentDao reqDao;
		
	public boolean raiseRequest(ResAssignmentReq rqObj) {
		
		reqDao.raiseRequest(rqObj);
		
		return false;
	}

	@Override
	public List<ResAssignmentReq> getAllRequest() {
		// TODO Auto-generated method stub
		return null;
	}

}
