package com.ss.api.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ss.api.document.Sequence;

public interface SequenceRepository extends MongoRepository<Sequence, String>, SequenceRepositoryCustom{
	

}
