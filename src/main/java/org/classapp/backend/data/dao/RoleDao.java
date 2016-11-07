package org.classapp.backend.data.dao;

import java.util.List;

import org.classapp.backend.data.model.Role;



public interface RoleDao {

	public Role selectById(Long id);
	public List<Role> selectAll();
	public void insert(Role role);
	public void Update(Role role);
	public void Delete(Role role);
}
