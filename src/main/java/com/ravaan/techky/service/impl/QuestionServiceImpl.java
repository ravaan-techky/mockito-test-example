package com.ravaan.techky.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravaan.techky.dto.Question;
import com.ravaan.techky.repository.QuestionRepository;
import com.ravaan.techky.service.QuestionService;

/**
 * The Class QuestionServiceImpl.
 */
@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	QuestionRepository questionRepository;
	
	
	/**
	 * Retrive question.
	 *
	 * @param surveyId the survey id
	 * @param questionId the question id
	 * @return the question
	 */
	@Override
	public Question retriveQuestion(String surveyId, String questionId) {
		Optional<Question> result = questionRepository.findById(questionId);
		return result.get();
	}

}
