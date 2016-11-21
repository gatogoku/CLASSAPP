
package org.classapp.backend.data.impl;

import java.util.List;

import org.classapp.backend.data.HibernateUtil;
import org.classapp.backend.data.dao.ChatGroupDAO;
import org.classapp.backend.data.model.ChatGroup;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 * implementation of ChatGroupDAO
 */
public class ChatGroupDAOHibernate implements ChatGroupDAO {

	/* 
	 * selects one ChatGroup by Id
	 * @param id
	 * @return ChatGroup
	 */
	public ChatGroup selectById(Long id) {
	    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    ChatGroup chatGroup = (ChatGroup) session.get(ChatGroup.class, id);
	    
	    session.close();
	    return chatGroup;
	}

	/*
	 * retrieves all ChatGroups from db
	 * @return List of ChatGroups
	 */
	public List<ChatGroup> selectAll() {
	    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    List<ChatGroup> chatGroups = session.createQuery("from ChatGroup").list();
	    
	    session.close();
	    return chatGroups;
	}

	/*
	 * inserts a new ChatGroup in database
	 * retrieves generated id and sets to ChatGroup instance
	 * @param new ChatGroup
	 */
	public void insert(ChatGroup chatGroup) {
	    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	
	    session.persist(chatGroup);
	         
	    session.getTransaction().commit();
	    session.close();

	}

	/*
	 * updates ChatGroup
	 * @param ChatGroup to update
	 */
	public void update(ChatGroup chatGroup) {
	    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		    Session session = sessionFactory.openSession();	 
		    session.beginTransaction();
		 
		    session.merge(chatGroup);
		 
		    session.getTransaction().commit();
		    session.close();
	}

	/*
	 * delete given ChatGroup
	 * @param ChatGroup to delete
	 */
	public void delete(ChatGroup chatGroup) {
	    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	    Session session = sessionFactory.openSession();	    
	    session.beginTransaction();
	    
	    session.delete(chatGroup);
	 
	    session.getTransaction().commit();
	    session.close();
	}



}
