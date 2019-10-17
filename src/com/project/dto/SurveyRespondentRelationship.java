package com.project.dto;

public class SurveyRespondentRelationship {

	private int distributionId;
	private int userId;
	private int responseStatus;
	public int getDistributionId() {
		return distributionId;
	}
	public void setDistributionId(int distributionId) {
		this.distributionId = distributionId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getResponseStatus() {
		return responseStatus;
	}
	public void setResponseStatus(int responseStatus) {
		this.responseStatus = responseStatus;
	}
	
	@Override
	public String toString() {
		return "SurveyRespondentRelationship [distributionId=" + distributionId + ", userId=" + userId
				+ ", responseStatus=" + responseStatus + "]";
	}
	
	
}
