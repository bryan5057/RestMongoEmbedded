package com.travelport.profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.util.Assert;

public class TravelerRepositoryImpl implements TravelerRepositoryCustom {

//	private final MongoOperations operations;

//	@Autowired
//	public TravelerRepositoryImpl(MongoOperations operations) {
//		Assert.notNull(operations, "MongoOperations must not be null!");
//		this.operations = operations;
//	}

//	public List<Traveler> myMethod(String branch) {
//		System.out.println("Inside myMehod");
//		return null;
//	}

	@Override
	public void someCustomMethod(Traveler traveler) {
		System.out.println("Inside myMehod");
		
	}



}
