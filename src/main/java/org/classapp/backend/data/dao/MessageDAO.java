package org.classapp.backend.data.dao;

import java.util.List;

import org.classapp.backend.data.model.Message;


/**
 *
 */
public interface MessageDAO {
	public Message selectById(Long id);
	public List<Message> selectAll ();
	public void insert (Message message);
	public void update (Message message);
	public void delete (Message message);
}
