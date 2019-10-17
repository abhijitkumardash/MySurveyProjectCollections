package com.project.dto;

import java.sql.Date;
import java.sql.Timestamp;

public class SurveyDistribution 
{
	private int distributionid; 
	private int surveyid;
	private Timestamp distributeddate;
	
	
	public int getDistributionid() {
		return distributionid;
	}
	public void setDistributionid(int distributionid) {
		this.distributionid = distributionid;
	}
	public int getSurveyid() {
		return surveyid;
	}
	public void setSurveyid(int surveyid) {
		this.surveyid = surveyid;
	}
	public Timestamp getDistributeddate() {
		return distributeddate;
	}
	public void setDistributeddate(Timestamp ts) {
		this.distributeddate = ts;
	}
	@Override
	public String toString() {
		return "SurveyDistribution [distributionid=" + distributionid + ", surveyid=" + surveyid + ", distributeddate="
				+ distributeddate + "]";
	}
	

}
