package com.wfm.services;

import java.util.List;

import com.wfm.models.ResourcesDetail;

public interface ResourceService {
	
	public boolean addResourse(ResourcesDetail rdObj);
	public List<ResourcesDetail> getAllResources();
	public ResourcesDetail validateResource(int rId,String rPassward);
	public ResourcesDetail getResourceById(int rId);

}
