package com.github.nachomezzadra.mongodbtest.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.nachomezzadra.mongodbtest.BaseSpringTest;
import com.github.nachomezzadra.mongodbtest.domain.CustomPojo;

public class CustomPojoDaoTest extends BaseSpringTest {

	@Autowired
	private CustomPojoDao customPojoDao;

	@Test
	public void shouldProperlySaveACustomPojo() throws Exception {
		String name = "Custom Pojo Name";
		String description = "Some Description";
		CustomPojo aCustomPojo = new CustomPojo(name, description);
		customPojoDao.save(aCustomPojo);
	}

}
