package com.project.service;

import com.project.dao.RepoImpl;

public class DeleteProfileService {
	public boolean deleteProfile(int userId)
	{
		RepoImpl dao = new RepoImpl();
		return dao.deleteProfile(userId);
		
	}
}
