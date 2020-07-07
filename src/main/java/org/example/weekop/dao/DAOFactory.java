package org.example.weekop.dao;

import org.example.weekop.exception.NoSuchDbTypeException;

public abstract class DAOFactory{
	
	public static final int MY_SQL_DAO_FACTORY = 1;
	
	public abstract DiscoveryDAO getDiscoveryDAO();
	
	public abstract UserDAO getUserDAO();
	
	public abstract VoteDAO getVoteDAO();
	
	public static DAOFactory getDAOFactory(){
		DAOFactory factory = null;
		try{
			factory = getDAOFactory(MY_SQL_DAO_FACTORY);
		} catch(NoSuchDbTypeException e){
			e.printStackTrace();
		}
		return factory;
	}
	
	private static DAOFactory getDAOFactory(int type) throws NoSuchDbTypeException{
		switch(type){
			case MY_SQL_DAO_FACTORY:
				return new MysqlDAOFactory();
			default:
				throw new NoSuchDbTypeException();
		}
	}
	
}
