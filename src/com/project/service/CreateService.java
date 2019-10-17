package com.project.service;

import com.project.dao.RepoImpl;
import com.project.dto.UserMaster;

public class CreateService 
{	
	public boolean createProfile(UserMaster um)
	{
		RepoImpl dao = new RepoImpl();
		return dao.createProfile(um);
		
	}

}
