package com.project.dao;

import com.project.dto.SurveyMaster;
import com.project.dto.UserMaster;

public interface UserMasterDAO {

	public UserMaster login(int uid,String pwd);
	public boolean createProfile(UserMaster um);
	public boolean update(UserMaster um);
	public boolean deleteProfile(int userId);
	public boolean addTitle(SurveyMaster sm);

}
