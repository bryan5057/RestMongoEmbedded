
package com.travelport.profile;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface TravelerRepository extends MongoRepository<Traveler, String>, TravelerRepositoryCustom {

	List<Traveler> findByLastName(@Param("name") String name);
	
	List<Traveler> findByFirstName(@Param("firstName") String firstName);
	
	List<Traveler> findByFirstNameAndLastName(@Param("firstName") String firstName, @Param("lastName") String lastName);
	
	List<Traveler> findByAccount(@Param("account") String account);

}
