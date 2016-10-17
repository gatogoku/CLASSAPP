package org.classapp.backend.data.impl;

import java.util.List;

import org.classapp.backend.data.HibernateSession;
import org.classapp.backend.data.dao.AvatarDAO;
import org.classapp.backend.data.model.Avatar;
import org.classapp.backend.data.model.Avatar;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateAvatarDAO implements AvatarDAO {
	
	public Avatar selectById(Long id) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		Avatar avatar = (Avatar) session.get(Avatar.class, id);
		session.close();
		return avatar;
	}

	/*
	 * retrieves all avatars from db
	 * 
	 * @return List of avatars
	 */
	public List<Avatar> selectAll() {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<Avatar> avatars = session.createCriteria(Avatar.class).list();
		session.close();
		return avatars;
	}

	/*
	 * inserts a new avatar in database retrieves generated id and sets to
	 * avatar instance
	 * 
	 * @param new avatar
	 */
	public void insert(Avatar avatar) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Long id =  (Long) session.save(avatar);
		
		session.getTransaction().commit();
		session.close();
	}
	/*
	 * updates avatar
	 * @param avatar to update
	 */
	public void update(Avatar avatar) {
		
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.merge(avatar);
		session.getTransaction().commit();
		session.close();
		
	}

	/*
	 * delete given avatar
	 * 
	 * @param avatar to delete
	 */
	public void delete(Avatar avatar) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(avatar);
		session.getTransaction().commit();
		session.close();
	}
	
	
	
	
	

}
