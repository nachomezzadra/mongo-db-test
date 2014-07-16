package com.github.nachomezzadra.mongodbtest.dao;

import com.github.nachomezzadra.mongodbtest.domain.CustomPojo;
import com.mongodb.MongoConnectionPoolMXBean;

public interface CustomPojoDao {

	/**
	 * Saves a {@link com.github.nachomezzadra.mongodbtest.domain.CustomPojo} into the Data base
	 * @param aCustomPojo
	 */
	void save(CustomPojo aCustomPojo);
	
	
}
