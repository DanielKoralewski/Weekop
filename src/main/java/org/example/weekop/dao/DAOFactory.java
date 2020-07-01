package org.example.weekop.dao;

public abstract class DAOFactory{
	
	public abstract DiscoveryDAO getDiscoveryDAO();
	
	public abstract UserDAO getUserDAO();
	
	public abstract VoteDAO getVoteDAO();
	
}