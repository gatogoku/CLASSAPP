package org.classapp.backend.data.dao;

import org.classapp.backend.data.model.Class;

public interface ClassDAO extends GenericDAO<Class> {

	
	public Class getUserClassById (Long idUser, Long IdEvent);
	
}
