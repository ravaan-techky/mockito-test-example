package com.ravaan.techky.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.ravaan.techky.dto.Question;

/**
 * The Class QuestionRepository.
 */
@Repository
public class QuestionRepository {

	/** The question list. */
	List<Question> questionList = new ArrayList<>();
	
	/**
	 * Instantiates a new question repository.
	 */
	public QuestionRepository() {
		questionList.add(new Question("1", "General Question", "What is you name?", "John Smith"));
		questionList.add(new Question("2", "Personal Question", "Are you Married?", "No"));
		questionList.add(new Question("3", "Educational Question", "What is your Highest Education", "BE"));
		questionList.add(new Question("100", "Job Question", "Wrong Question?", "Not Applicable"));
	}
	
	/**
	 * Find by id.
	 *
	 * @param questionId the question id
	 * @return the optional
	 */
	public Optional<Question> findById(String questionId) {
		return questionList.stream().filter(question -> question.getId().equalsIgnoreCase(questionId)).findFirst();
	}
}
