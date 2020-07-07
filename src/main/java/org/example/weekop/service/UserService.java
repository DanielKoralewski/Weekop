package org.example.weekop.service;

import org.example.weekop.dao.DAOFactory;
import org.example.weekop.dao.UserDAO;
import org.example.weekop.model.User;

public class UserService{
	public void addUser(String username, String email, String password){
		User user = new User();
		user.setUsername(username);
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(password);
		user.setActive(true);
		DAOFactory factory = DAOFactory.getDAOFactory();
		UserDAO userDAO = factory.getUserDAO();
		userDAO.create(user);
	}

}
