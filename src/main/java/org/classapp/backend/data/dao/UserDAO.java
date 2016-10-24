package org.classapp.backend.data.dao;

import java.util.List;

import org.classapp.backend.data.model.User;





public interface UserDAO {

	
	
	
	public User selectById(Long id);

	public List<User> selectAll();

	public void insert(User user);

	public void update(User user);

	public void delete(User user);

	
	
}
