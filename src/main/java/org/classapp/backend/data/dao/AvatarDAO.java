package org.classapp.backend.data.dao;

import java.util.List;

import org.classapp.backend.data.model.Avatar;

public interface AvatarDAO {
	
	
	public Avatar selectById(Long id);

	public List<Avatar> selectAll();

	public void insert(Avatar avatar);

	public void update(Avatar avatar);

	public void delete(Avatar avatar);

}
