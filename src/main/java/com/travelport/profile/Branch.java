package com.travelport.profile;

import org.springframework.data.annotation.Id;

public class Branch {

	@Id 
	private String id;
	
	private String agency;
	
	private String name;

    public Branch() {
	}

	public Branch(String id) {
        this.id = id;
    }
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the agency
	 */
	public String getAgency() {
		return agency;
	}

	/**
	 * @param agency the agency to set
	 */
	public void setAgency(String agency) {
		this.agency = agency;
	}
	
	
}

