package com.project.service;

import com.project.dao.RepoImpl;
import com.project.dto.SurveyMaster;

public class AddService 
{
	public boolean addTitle(SurveyMaster sm)
	{
		RepoImpl dao = new RepoImpl();
		return dao.addTitle(sm);
		
	}

}
