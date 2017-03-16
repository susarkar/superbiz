package com.ss.api.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.util.Assert;

import com.ss.api.document.Sequence;


public class SequenceRepositoryImpl implements SequenceRepositoryCustom{
	
	
	private final MongoOperations operations;

	  @Autowired
	  public SequenceRepositoryImpl(MongoOperations operations) {

	    Assert.notNull(operations, "MongoOperations must not be null!");
	    this.operations = operations;
	  }
	
	@Override
	public long getNextSequenceId(String documentName) {
		  //get sequence id
		  Query query = new Query(Criteria.where("_id").is(documentName));

		  //increase sequence id by 1
		  Update update = new Update();
		  update.inc("seq", 1);

		  //return new increased id
		  FindAndModifyOptions options = new FindAndModifyOptions();
		  options.returnNew(true);

		  //this is the magic happened.
		  Sequence sequence = operations.findAndModify(query, update, options, Sequence.class);

		  //if no id, throws SequenceException
	          //optional, just a way to tell user when the sequence id is failed to generate.
	/*	  if (seqId == null) {
			throw new SequenceException("Unable to get sequence id for key : " + key);
		  }*/

		  return sequence.getSeq();
	}

}
