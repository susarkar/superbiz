package com.ss.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ss.app.document.Sequence;

public interface SequenceRepository extends MongoRepository<Sequence, String>, SequenceRepositoryCustom{

}
