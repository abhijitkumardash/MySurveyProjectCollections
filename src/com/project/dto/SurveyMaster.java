package com.project.dto;

public class SurveyMaster
{
	private int surveyId;
	private String title;
	private String description;
	private int userId;
	
	public int getSurveyId() {
		return surveyId;
	}
	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "SurveyMaster [surveyId=" + surveyId + ", title=" + title + ", description=" + description + ", userId="
				+ userId + "]";
	}
	
	

}
