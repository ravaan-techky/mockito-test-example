package com.ravaan.techky.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import com.ravaan.techky.dto.Question;
import com.ravaan.techky.service.QuestionService;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class QuestionControllerTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@MockBean
	private QuestionService questionService;

	@DisplayName("Test Retrive Question case")
	@Test
	public void testRetriveQuestion() throws Exception {
		Question question = new Question("1", "General Question", "What is you name?", "John Smith");
		Mockito.when(questionService.retriveQuestion(Mockito.anyString(), Mockito.anyString())).thenReturn(question);

		ResponseEntity<String> response = restTemplate
				.getForEntity("http://localhost:" + port + "/retriveQuestion/survey/1/question/1", String.class);
		String excepted = "{\"id\":\"1\",\"description\":\"General Question\",\"question\":\"What is you name?\",\"expectedAnswer\":\"John Smith\"}";
		JSONAssert.assertEquals(excepted, response.getBody(), false);
	}
}
