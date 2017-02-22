package com.travelport.profile;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "agencies", path = "agencies")
public interface AgencyRepository extends MongoRepository<Agency, String> {
}
