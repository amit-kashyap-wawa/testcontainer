package com.example.testcontainer;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.MongoDBContainer;

public class MongoDbContainerTest {


    @Test
    public void containerStartsAndPublicPortIsAvailable1() throws Exception {
    	try(MongoDBContainer mongoDbContainer = new MongoDBContainer()){
    		mongoDbContainer.start();
    		Assert.assertTrue(mongoDbContainer.isRunning());
    		}
    }
    
}
