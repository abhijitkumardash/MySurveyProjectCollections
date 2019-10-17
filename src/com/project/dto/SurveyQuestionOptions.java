package com.project.dto;

public class SurveyQuestionOptions 
{
	private int optionId;
	private  int questionId;
	private String optionDescription;
	public int getOptionId() {
		return optionId;
	}
	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getOptionDescription() {
		return optionDescription;
	}
	public void setOptionDescription(String optionDescription) {
		this.optionDescription = optionDescription;
	}
	@Override
	public String toString() {
		return "SurveyQuestionOptions [optionId=" + optionId + ", questionId=" + questionId + ", optionDescription="
				+ optionDescription + "]";
	}
	
	

}
