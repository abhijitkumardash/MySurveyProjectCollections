package com.project.service;

import com.project.dao.RepoImpl;
import com.project.dto.UserMaster;

public class LoginService 
{
	public UserMaster login(int uid,String pwd)
	{
	         RepoImpl dao = new RepoImpl();
		return dao.login(uid,pwd);
	}

}
