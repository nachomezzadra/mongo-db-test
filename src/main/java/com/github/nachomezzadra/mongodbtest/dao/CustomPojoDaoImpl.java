package com.github.nachomezzadra.mongodbtest.dao;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.github.nachomezzadra.mongodbtest.domain.CustomPojo;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

@Repository
public class CustomPojoDaoImpl implements CustomPojoDao {

	@Autowired
	private MongoClient mongoClient;
	@Autowired
	private DB db;
	
	public void save(CustomPojo aCustomPojo) {
//		DB db = mongoClient.getDB("test");
		
		DBCollection table = db.getCollection(aCustomPojo.getClass().getSimpleName());
		BasicDBObject document = new BasicDBObject();
		document.put("name", aCustomPojo.getName());
		document.put("description", aCustomPojo.getDescription());
		document.put("createdDate", new Date());
		table.insert(document);
	}
	
}
