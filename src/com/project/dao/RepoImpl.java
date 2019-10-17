package com.project.dao;

import com.project.dto.SurveyMaster;
import com.project.dto.UserMaster;
import com.project.repo.SurveyMasterRepo;
import com.project.repo.UserMasterRepo;

public class RepoImpl implements UserMasterDAO {
	UserMasterRepo db = new UserMasterRepo();
	SurveyMasterRepo db1 = new SurveyMasterRepo();
	@Override
	public boolean deleteProfile(int userId) {
		UserMaster um = null;
		for(UserMaster u:db.usermaster) {
			if(u.getUserId()==userId) {
				return true;
			}	
		}
		return false;
	}
	@Override
	public UserMaster login(int uid,String pwd) {
		UserMaster um = null;
		for(UserMaster u:db.usermaster) {
			if(u.getUserId()==uid && u.getPassword().equals(pwd)) {
				um = u;
			}
		}
		return um;
	}

	@Override
	public boolean update(UserMaster um) {
		for(UserMaster u:db.usermaster) {
			if(u.getClass().equals(um)) {
				return true;
			}

		}
		return false;

	}
	@Override
	public boolean createProfile(UserMaster um) {
		for(UserMaster u:db.usermaster) {
			if(u.getClass().equals(um)) {
				return false;
			}
		}
		return true;
	}
	@Override
	public boolean addTitle(SurveyMaster sm) {
		for(SurveyMaster s:db1.surveymaster) {
			if(s.getTitle().equals(sm)) {
				return false;
			}
		}
		return true;
	}

}
