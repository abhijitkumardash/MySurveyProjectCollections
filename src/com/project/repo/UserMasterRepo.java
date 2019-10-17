package com.project.repo;

import java.util.HashSet;

import com.project.dto.SurveyDistribution;
import com.project.dto.SurveyMaster;
import com.project.dto.SurveyQuestionDetails;
import com.project.dto.SurveyQuestionOptions;
import com.project.dto.SurveyRespondentRelationship;
import com.project.dto.SurveyRespondentsAnswers;
import com.project.dto.UserMaster;

public class UserMasterRepo {
	public HashSet<UserMaster> usermaster = new HashSet<>();


	public UserMasterRepo(){
		UserMaster um1 = new UserMaster();

		um1.setUserId(1);
		um1.setPassword("123");
		um1.setFirstName("saikavya");
		um1.setLastName("chinni");
		um1.setUserType("Admin");

		UserMaster um2 = new UserMaster(); 
		um2.setUserId(2);
		um2.setPassword("123");
		um2.setFirstName("sai");
		um2.setLastName("bindu");
		um2.setUserType("Surveyor");

		UserMaster um3 = new UserMaster();
		um3.setUserId(3);
		um3.setPassword("123");
		um3.setFirstName("gayatri");
		um3.setLastName("ponugoti");
		um3.setUserType("Respondent");

		usermaster.add(um1);
		usermaster.add(um2);
		usermaster.add(um3);
	}

}
class SurveyDistributionRepo{
	public HashSet<SurveyDistribution> userMaster = new HashSet<>();

	public SurveyDistributionRepo() {
		SurveyDistribution sd = new SurveyDistribution();
		//Timestamp ts = new Timestamp(11/05/2019,)

		sd.setDistributionid(21);
		sd.setSurveyid(1);
		//sd.setDistributeddate(now);

		sd.setDistributionid(22);
		sd.setSurveyid(1);
		//sd.setDistributeddate(now);


	}
}

//class SurveyMasterRepo{
//	public HashSet<SurveyMaster> surveymaster = new  HashSet<>();
//	
//	public SurveyMasterRepo() {
//		SurveyMaster sm1 = new SurveyMaster();
//		sm1.setSurveyId(10);
//		sm1.setDescription("unemployment");
//		sm1.setTitle("student");
//		sm1.setUserId(2);
//		
//		SurveyMaster sm2 = new SurveyMaster();
//		sm2.setSurveyId(11);
//		sm2.setDescription("development");
//		sm2.setTitle("jspiders");
//		sm2.setUserId(1);
//		
//		SurveyMaster sm3 = new SurveyMaster();
//		sm3.setSurveyId(12);
//		sm3.setDescription("testing");
//		sm3.setTitle("qspiders");
//		sm3.setUserId(2);
//		
//		surveymaster.add(sm1);
//		surveymaster.add(sm2);
//		surveymaster.add(sm3);
//	}
//}

class SurveyQuestionDetailsRepo{
	public HashSet<SurveyQuestionDetails> surveyquesdetails = new  HashSet<>();

	public SurveyQuestionDetailsRepo() {
		SurveyQuestionDetails sqd1 = new SurveyQuestionDetails();
		sqd1.setQuestionid(1);
		sqd1.setQuestiontext("who is your sql trainer?");
		sqd1.setQuestiontype(1);
		sqd1.setSurveyid(201);

		SurveyQuestionDetails sqd2 = new SurveyQuestionDetails();
		sqd2.setQuestionid(2);
		sqd2.setQuestiontext("who is your html trainer?");
		sqd2.setQuestiontype(2);
		sqd2.setSurveyid(201);

		surveyquesdetails.add(sqd1);
		surveyquesdetails.add(sqd2);
	}

}


class SurveyQuestionOptionsRepo{
	public HashSet<SurveyQuestionOptions> surveyquesoptions = new  HashSet<>();

	public SurveyQuestionOptionsRepo() {
		SurveyQuestionOptions sqo1 = new SurveyQuestionOptions();
		sqo1.setOptionDescription("saikavya");
		sqo1.setOptionId(1);
		sqo1.setQuestionId(1);

		SurveyQuestionOptions sqo2 = new SurveyQuestionOptions();
		sqo2.setOptionDescription("saibindu");
		sqo2.setOptionId(2);
		sqo2.setQuestionId(2);

		SurveyQuestionOptions sqo3 = new SurveyQuestionOptions();
		sqo3.setOptionDescription("saikavya");
		sqo3.setOptionId(3);
		sqo3.setQuestionId(1);

		surveyquesoptions.add(sqo1);
		surveyquesoptions.add(sqo2);
		surveyquesoptions.add(sqo3);
	}

}


class SurveyRespondentRelationshipRepo{
	public HashSet<SurveyRespondentRelationship> surveyrespondentrel = new  HashSet<>();

	public SurveyRespondentRelationshipRepo() {
		SurveyRespondentRelationship srr1 = new SurveyRespondentRelationship();
		srr1.setDistributionId(21);
		srr1.setResponseStatus(1);
		srr1.setUserId(1);

		SurveyRespondentRelationship srr2 = new SurveyRespondentRelationship();
		srr2.setDistributionId(22);
		srr2.setResponseStatus(2);
		srr2.setUserId(1);

		surveyrespondentrel.add(srr1);
		surveyrespondentrel.add(srr2);
	}
}


class SurveyRespondentsAnswersRepo{
	public HashSet<SurveyRespondentsAnswersRepo> surveyrespondentans = new  HashSet<>();

	public SurveyRespondentsAnswersRepo() {
		SurveyRespondentsAnswers srs1 = new SurveyRespondentsAnswers();
		srs1.setAnswerText("nagesh sir");
		srs1.setDistributionId(21);
		srs1.setOptionId(41);
		srs1.setQuestionId(11);
		srs1.setUserId(1);

		SurveyRespondentsAnswers srs2 = new SurveyRespondentsAnswers();
		srs2.setAnswerText("kishore sir");
		srs2.setDistributionId(22);
		srs2.setOptionId(42);
		srs2.setQuestionId(12);
		srs2.setUserId(2);

		//surveyrespondentans.add(srs1);

	}

}