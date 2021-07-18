package com.ravaan.techky.service;

import com.ravaan.techky.dto.Question;

/**
 * The Interface QuestionService.
 */
public interface QuestionService {

	/**
	 * Retrive question.
	 *
	 * @param surveyId the survey id
	 * @param questionId the question id
	 * @return the question
	 */
	Question retriveQuestion(String surveyId, String questionId);
}
