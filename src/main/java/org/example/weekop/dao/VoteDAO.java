package org.example.weekop.dao;

import org.example.weekop.model.Vote;

public interface VoteDAO extends GenericDAO<Vote, Long>{
	
	public Vote getVoteByUserIdDiscoveryId(long userId, long discoveryId);

}
