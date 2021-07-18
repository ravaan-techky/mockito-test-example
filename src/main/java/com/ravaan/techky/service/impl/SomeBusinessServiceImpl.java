package com.ravaan.techky.service.impl;

import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.ravaan.techky.repository.DataRepository;
import com.ravaan.techky.service.SomeBusinessService;

/**
 * The Class SomeBusinessServiceImpl.
 */
@Service
public class SomeBusinessServiceImpl implements SomeBusinessService {

	/** The data repository. */
	DataRepository dataRepository;

	/**
	 * Instantiates a new some business service impl.
	 *
	 * @param dataRepository the data repository
	 */
	SomeBusinessServiceImpl(DataRepository dataRepository) {
		this.dataRepository = dataRepository;
	}

	/**
	 * Gets the max number from data.
	 *
	 * @return the max number from data
	 */
	public int getMaxNumberFromData() {
		return Stream.of(dataRepository.getAllData()).max((num1, num2) -> {
			return num1.compareTo(num2);
		}).get();
	}

}
