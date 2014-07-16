package com.github.nachomezzadra.mongodbtest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
public class MongoConfiguration extends AbstractMongoConfiguration {

	private static final String DB_NAME = "test";

	@Override
	protected String getDatabaseName() {
		return DB_NAME;
	}

	@Override
	public Mongo mongo() throws Exception {
		return new MongoClient("127.0.0.1");
	}

}
