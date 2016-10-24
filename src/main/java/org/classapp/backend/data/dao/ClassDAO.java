package org.classapp.backend.data.dao;

import java.util.List;

import org.classapp.backend.data.model.Class;

public interface ClassDAO {

	public Class selectById(Long id);

	public List<Class> selectAll();

	public void insert(Class aClass);

	public void update(Class aClass);

	public void delete(Class aClass);
	
}
