package com.github.nachomezzadra.mongodbtest;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mongodb.Mongo;

import de.flapdoodle.embed.mongo.MongodExecutable;
import de.flapdoodle.embed.mongo.MongodProcess;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/META-INF/mongo-db-test-context.xml" })
public abstract class BaseSpringTest {

	private static final String DATABASE_NAME = "embedded";

	private MongodExecutable mongodExe;
	private MongodProcess mongod;
	private Mongo mongo;

	// @Before
	// public void beforeEach() throws Exception {
	// MongoDBRuntime runtime = MongoDBRuntime.getDefaultInstance();
	// mongodExe = runtime.prepare(new MongodConfig(Version.V2_3_0, 12345,
	// Network.localhostIsIPv6()));
	// mongod = mongodExe.start();
	// mongo = new Mongo("localhost", 12345);
	// }
	//
	// @After
	// public void afterEach() throws Exception {
	// if (this.mongod != null) {
	// this.mongod.stop();
	// this.mongodExe.stop();
	// }
	// }
}
