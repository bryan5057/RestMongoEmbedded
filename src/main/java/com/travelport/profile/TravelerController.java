package com.travelport.profile;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@RestController
@RequestMapping("/travelers")
public class TravelerController {
	
	@Autowired
	TravelerRepository travelerRepository;
	
	@Autowired
	AccountRepository  accountRepository;
	
//	MongoClient mongoClient = new MongoClient();
//	MongoDatabase database = mongoClient.getDatabase("test");
//	MongoCollection<Document> travelerCollection = database.getCollection("traveler");
	
    @RequestMapping(method = RequestMethod.GET)
    public Traveler get() {
    	System.out.println("GET");
        return new Traveler();
    }
    
    @RequestMapping(value = "/findByBranch", method = RequestMethod.GET)
    public List<Traveler> findByBranch(@Param("branch") String branch) {
    	System.out.println("findByBranch - branch = " + branch);
    	List<Traveler> travelers = new ArrayList<Traveler>();
    	
    	if (accountRepository != null) {
    		List<Account> accounts = accountRepository.findByBranch(branch);
    		for (Account account : accounts) {
				System.out.println("found account = " + account.getName());
				List<Traveler> acctTravelers = travelerRepository.findByAccount(account.getName());
				for (Traveler traveler : acctTravelers) {
					System.out.println("found traveler = " + traveler.getFirstName());
				}
				travelers.addAll(acctTravelers);
			}
    	} else {
    		System.out.println("accountRepository is null");
    	}
    	
        return travelers;
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public Traveler createTraveler(@RequestBody Traveler traveler) {
    	System.out.println("createTraveler");
    	
//    	// Retrieve "Acme Travel" agency to get its ID
//    	FindIterable<Document> accountIt = travelerCollection.find(new Document("name", "Acme Travel"));
//    	Document agency = accountIt.first();
//    	if (agency != null) {
//    		System.out.println("found account");
//    		
//    		ObjectId accountID = agency.getObjectId("_id");
//    		System.out.println("account id = " + accountID.toString());
//    		
//    		traveler.setAccount(accountID);
//    		repository.insert(traveler);
//    		System.out.println("Inserted new traveler");
//    	}
//    	else {
//    		System.out.println("account is null");
//    	}
    	
        return new Traveler();
    }
}
