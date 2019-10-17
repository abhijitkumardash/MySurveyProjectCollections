package com.project.dto;

public class JoinQuestion {
	
	private int questionid;
	private String questiontext;
	private int optionId;
	private String optionDescription;
	
	public int getQuestionid() {
		return questionid;
	}
	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}
	public String getQuestiontext() {
		return questiontext;
	}
	public void setQuestiontext(String questiontext) {
		this.questiontext = questiontext;
	}
	public int getOptionId() {
		return optionId;
	}
	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}
	public String getOptionDescription() {
		return optionDescription;
	}
	public void setOptionDescription(String optionDescription) {
		this.optionDescription = optionDescription;
	}
	
	@Override
	public String toString() {
		return "JoinQuestion [questionid=" + questionid + ", questiontext=" + questiontext + ", optionId=" + optionId
				+ ", optionDescription=" + optionDescription + "]";
	}
	
	
	

}
