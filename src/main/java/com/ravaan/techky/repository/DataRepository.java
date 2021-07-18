package com.ravaan.techky.repository;

import org.springframework.stereotype.Repository;

/**
 * The Class DataRepository.
 */
@Repository
public class DataRepository {
	
	/**
	 * Gets the all data.
	 *
	 * @return the all data
	 */
	public Integer[] getAllData() {
		return new Integer[] { 25, 45, 35 };
	}
}
