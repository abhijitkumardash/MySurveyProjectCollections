package com.project.dto;

public class SurveyMultipleClicks {
	private int questionId;
	private String Question;
	private String options;
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public String getOptions() {
		return options;
	}
	public void setOptions(String options) {
		this.options = options;
	}
	@Override
	public String toString() {
		return "SurveyMultipleClicks [questionId=" + questionId + ", Question=" + Question + ", options=" + options
				+ "]";
	}
	
	

}
