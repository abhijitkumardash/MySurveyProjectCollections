package com.project.service;

import com.project.dao.RepoImpl;
import com.project.dto.UserMaster;

public class UpdateService
{
	public boolean update(UserMaster um)
	{
		RepoImpl dao = new RepoImpl();
		return dao.update(um);
		
	}

}
