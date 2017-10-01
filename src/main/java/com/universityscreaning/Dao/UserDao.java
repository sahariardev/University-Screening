package com.universityscreaning.Dao;

import java.util.List;

import org.springframework.context.annotation.Bean;

import com.universityscreaning.model.User;


public interface UserDao {
	
	public void setDataSource();
	public boolean createUser(User usr);
	public boolean delete(User usr);
	public boolean update(User usr);
	public void cleanup();
	public User getUser(int id);
	public List<User> getAllUser();
	

}
