package com.travelport.profile;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Traveler {

	@Id 
	private String id;
	
	private String account;

	private String firstName;
	private String lastName;
    
    public Traveler() {
	}

	public Traveler(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(String account) {
		this.account = account;
	}

}
