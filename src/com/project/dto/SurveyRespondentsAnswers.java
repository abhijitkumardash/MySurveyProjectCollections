package com.project.dto;

public class SurveyRespondentsAnswers {
	private int userId;
	private int  distributionId;
	private int questionId;
	private int optionId;
	private String answerText;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getDistributionId() {
		return distributionId;
	}
	public void setDistributionId(int distributionId) {
		this.distributionId = distributionId;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public int getOptionId() {
		return optionId;
	}
	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}
	public String getAnswerText() {
		return answerText;
	}
	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}
	
	@Override
	public String toString() {
		return "SurveyRespondentsAnswers [userId=" + userId + ", distributionId=" + distributionId + ", questionId="
				+ questionId + ", optionId=" + optionId + ", answerText=" + answerText + "]";
	}
	
	
	

}
