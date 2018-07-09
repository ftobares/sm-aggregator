package ar.com.ftobares.backendsm.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import ar.com.ftobares.backendsm.model.Interests;

public interface InterestsRepository extends MongoRepository<Interests, String> {
	
	public List<Interests> findByName(String name);

}
