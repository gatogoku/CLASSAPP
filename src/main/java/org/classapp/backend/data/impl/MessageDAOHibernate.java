
package org.classapp.backend.data.impl;

import java.util.List;

import org.classapp.backend.data.HibernateUtil;
import org.classapp.backend.data.dao.MessageDAO;
import org.classapp.backend.data.model.Message;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 * implementation of MessageDAO
 */
public class MessageDAOHibernate implements MessageDAO {

	/* 
	 * selects one Message by Id
	 * @param id
	 * @return Message
	 */
	public Message selectById(Long id) {
	    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    Message message = (Message) session.get(Message.class, id);
	    
	    session.close();
	    return message;
	}

	/*
	 * retrieves all Messages from db
	 * @return List of Messages
	 */
	public List<Message> selectAll() {
	    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    List<Message> messages = session.createQuery("from Message").list();
	    
	    session.close();
	    return messages;
	}

	/*
	 * inserts a new Message in database
	 * retrieves generated id and sets to Message instance
	 * @param new Message
	 */
	public void insert(Message message) {
	    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	
	    session.persist(message);
	         
	    session.getTransaction().commit();
	    session.close();

	}

	/*
	 * updates Message
	 * @param Message to update
	 */
	public void update(Message message) {
	    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		    Session session = sessionFactory.openSession();	 
		    session.beginTransaction();
		 
		    session.merge(message);
		 
		    session.getTransaction().commit();
		    session.close();
	}

	/*
	 * delete given Message
	 * @param Message to delete
	 */
	public void delete(Message message) {
	    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	    Session session = sessionFactory.openSession();	    
	    session.beginTransaction();
	    
	    session.delete(message);
	 
	    session.getTransaction().commit();
	    session.close();
	}

}
