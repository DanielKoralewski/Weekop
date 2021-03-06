package org.example.weekop.dao;

import org.example.weekop.model.User;
import org.example.weekop.util.ConnectionProvider;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import java.util.List;

public class UserDAOImlp implements UserDAO{
	private static final  String CREATE_USER =
			"INSERT INTO user (username, email, password, is_active) VALUES (:username, :email, :password, :active)";
	
	private NamedParameterJdbcTemplate template;
	
	public UserDAOImlp(){
		template = new NamedParameterJdbcTemplate(ConnectionProvider.getDataSource());
	}
	
	@Override
	public User create(User user){
		User resultUser = new User(user);
		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(user);
		int update = template.update(CREATE_USER, paramSource, holder);
		if(update > 0){
		resultUser.setId(holder.getKey().longValue());
		setPrivilages(resultUser);
		}
		return resultUser;
	}
	
	private void setPrivilages(User user){
		final String userRoleQuery = "INSERT INTO user_role(username) VALUES(:username)";
		SqlParameterSource parameterSource = new BeanPropertySqlParameterSource(user);
		template.update(userRoleQuery,parameterSource);
	}
	
	@Override
	public User read(Long primaryKey){
		return null;
	}
	
	@Override
	public boolean update(User updateObject){
		return false;
	}
	
	@Override
	public boolean delete(Long key){
		return false;
	}
	
	@Override
	public List<User> getAll(){
		return null;
	}
	
	@Override
	public User getUserByUsername(String username){
		return null;
	}
}
