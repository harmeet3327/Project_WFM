package com.wfm.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wfm.dao.RequestAssignmentDao;
import com.wfm.models.ResAssignmentReq;

@Repository("reqDao")
public class RequestAssignmentDaoImpl implements RequestAssignmentDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean raiseRequest(ResAssignmentReq rqObj) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.persist(rqObj);
			return true;
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return false;
	}

	@Override
	public List<ResAssignmentReq> getAllRequest() {
		// TODO Auto-generated method stub
		return null;
	}

}
