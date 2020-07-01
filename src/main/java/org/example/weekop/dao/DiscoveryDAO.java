package org.example.weekop.dao;

import org.example.weekop.model.Discovery;

import java.util.List;

public interface DiscoveryDAO extends GenericDAO<Discovery, Long>{
	
	List<Discovery> getAll();
	
}
