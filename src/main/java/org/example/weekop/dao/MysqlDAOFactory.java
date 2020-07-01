package org.example.weekop.dao;

public class MysqlDAOFactory extends DAOFactory{
	
	@Override
	public DiscoveryDAO getDiscoveryDAO(){
		return new DiscoveryDAOImpl();
	}
	
	@Override
	public UserDAO getUserDAO(){
		return new UserDAOImlp();
	}
	
	@Override
	public VoteDAO getVoteDAO(){
		return new VoteDAOImpl();
	}

}