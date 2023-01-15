package com.learnSpringBoot.restapilearning.survey;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SurveyResource {
	
	SurveyService service = new SurveyService();
	
	
	@RequestMapping(value="/surveys", method = RequestMethod.GET)
	public List<Survey> retrieveAllSurveys() {
		return service.retrieveAllSurveys();
	}
	
	
	@RequestMapping("/surveys/{surveyId}")
	public Survey retrieveSurveyById(@PathVariable String surveyId) {
		return service.retrieveSurveyById(surveyId);
	}
	
	
	@RequestMapping("/surveys/{surveyId}/questions")
	public List<Question> retrieveQuestionBySurveyId(@PathVariable String surveyId) {
		return service.retrieveQuestionBySurveyId(surveyId);
	}
	
	

}
