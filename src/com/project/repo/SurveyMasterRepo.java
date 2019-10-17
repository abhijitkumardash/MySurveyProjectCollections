package com.project.repo;

import java.util.HashSet;

import com.project.dto.SurveyMaster;

public class SurveyMasterRepo {
public HashSet<SurveyMaster> surveymaster = new  HashSet<>();
	
	public SurveyMasterRepo() {
		SurveyMaster sm1 = new SurveyMaster();
		sm1.setSurveyId(10);
		sm1.setDescription("unemployment");
		sm1.setTitle("student");
		sm1.setUserId(2);
		
		SurveyMaster sm2 = new SurveyMaster();
		sm2.setSurveyId(11);
		sm2.setDescription("development");
		sm2.setTitle("jspiders");
		sm2.setUserId(1);
		
		SurveyMaster sm3 = new SurveyMaster();
		sm3.setSurveyId(12);
		sm3.setDescription("testing");
		sm3.setTitle("qspiders");
		sm3.setUserId(2);
		
		surveymaster.add(sm1);
		surveymaster.add(sm2);
		surveymaster.add(sm3);
	}

}
