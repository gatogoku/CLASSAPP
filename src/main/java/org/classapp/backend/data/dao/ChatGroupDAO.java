package org.classapp.backend.data.dao;

import java.util.List;

import org.classapp.backend.data.model.ChatGroup;


/**
 *
 */
public interface ChatGroupDAO {
	public ChatGroup selectById(Long id);
	public List<ChatGroup> selectAll ();
	public void insert (ChatGroup chatGroup);
	public void update (ChatGroup chatGroup);
	public void delete (ChatGroup chatGroup);
}
