package com.wfm.daoimpl;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wfm.dao.ResourceDao;
import com.wfm.models.ResourcesDetail;

@Repository("resDao")

public class ResourceDaoImpl implements ResourceDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean addResourse(ResourcesDetail rdObj) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.persist(rdObj);
			return true;
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return false;
	}
	
	public List<ResourcesDetail> getAllResources() {
		try {
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from com.wfm.models.ResourcesDetail");
			return query.list();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		return null;
	}

	public ResourcesDetail validateResource(int rId,String rPassward)
	{
		try {
			System.out.println("in Dao");
			Session session=sessionFactory.getCurrentSession();
			ResourcesDetail rObj=session.get(ResourcesDetail.class, rId);
			
		 
			if(rObj!=null){
				if(rObj.getrPassward().equals(rPassward)){
					return rObj;
				}
			}
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return null;
		
		
		
		
	}


	public ResourcesDetail getResourceById(int rId) {
		try {
			Session session=sessionFactory.getCurrentSession();
			ResourcesDetail rObj=session.get(ResourcesDetail.class,rId);
			return rObj;
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return null;
	}
	}
