package com.travelport.profile;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "branches", path = "branches")
public interface BranchRepository extends MongoRepository<Branch, String> {
}
