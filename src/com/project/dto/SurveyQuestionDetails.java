package com.project.dto;

public class SurveyQuestionDetails
{
	private int questionid;
	private int surveyid;
	private String questiontext;
	private int questiontype;
	
	
	public int getQuestionid() {
		return questionid;
	}
	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}
	public int getSurveyid() {
		return surveyid;
	}
	public void setSurveyid(int surveyid) {
		this.surveyid = surveyid;
	}
	public String getQuestiontext() {
		return questiontext;
	}
	public void setQuestiontext(String questiontext) {
		this.questiontext = questiontext;
	}
	public int getQuestiontype() {
		return questiontype;
	}
	public void setQuestiontype(int questiontype) {
		this.questiontype = questiontype;
	}
	@Override
	public String toString() {
		return "SurveyQuestionDetails [questionid=" + questionid + ", surveyid=" + surveyid + ", questiontext="
				+ questiontext + ", questiontype=" + questiontype + "]";
	}
	
	

}
