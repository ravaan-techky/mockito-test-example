package com.ravaan.techky.service.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.ravaan.techky.repository.DataRepository;

/**
 * The Class SomeBusinessServiceImplTest.
 */
@SpringBootTest
public class SomeBusinessServiceImplTest {

	/** The data repository. */
	@Mock
	private DataRepository dataRepository;

	/** The Some business service. */
	@InjectMocks
	private SomeBusinessServiceImpl SomeBusinessService;

	/**
	 * Test get max number from data.
	 */
	@Test
	public void testGetMaxNumberFromData() {
		when(dataRepository.getAllData()).thenReturn(new Integer[] { 10, 15, 20 });
		int maxNumber = SomeBusinessService.getMaxNumberFromData();
		assertEquals(20, maxNumber);
	}

}
