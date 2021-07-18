package com.ravaan.techky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ravaan.techky.dto.Question;
import com.ravaan.techky.service.QuestionService;

@RestController
public class QuestionController {

	@Autowired
	private QuestionService questionService;
	
	@GetMapping("/retriveQuestion/survey/{surveyId}/question/{questionId}")
	public Question retriveQuestion(@PathVariable String surveyId, @PathVariable String questionId) {
		return questionService.retriveQuestion(surveyId, questionId);
	}
}
