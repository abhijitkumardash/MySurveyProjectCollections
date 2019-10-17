package com.project.dto;

public class SurveyAnswers {
	private  int userid;
	private String answer;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "SurveyAnswers [userid=" + userid + ", answer=" + answer + "]";
	}

}
