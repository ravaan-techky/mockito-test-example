package com.ravaan.techky.dto;

/**
 * The Class Question.
 */
public class Question {

	/** The id. */
	private String id;

	/** The description. */
	private String description;

	/** The question. */
	private String question;

	/** The expected answer. */
	private String expectedAnswer;

	/**
	 * Instantiates a new question.
	 */
	public Question() {
		// DUMMY
	}

	/**
	 * Instantiates a new question.
	 *
	 * @param id the id
	 * @param descrition the descrition
	 * @param question the question
	 * @param expectedAnswer the expected answer
	 */
	public Question(String id, String descrition, String question, String expectedAnswer) {
		this.id = id;
		this.description = descrition;
		this.question = question;
		this.expectedAnswer = expectedAnswer;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the question.
	 *
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * Sets the question.
	 *
	 * @param question the new question
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * Gets the expected answer.
	 *
	 * @return the expected answer
	 */
	public String getExpectedAnswer() {
		return expectedAnswer;
	}

	/**
	 * Sets the expected answer.
	 *
	 * @param expectedAnswer the new expected answer
	 */
	public void setExpectedAnswer(String expectedAnswer) {
		this.expectedAnswer = expectedAnswer;
	}
}
