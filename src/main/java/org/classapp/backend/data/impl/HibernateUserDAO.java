package org.classapp.backend.data.impl;

import java.util.List;

import org.classapp.backend.data.dao.UserDAO;
import org.classapp.backend.data.HibernateSession;
import org.classapp.backend.data.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateUserDAO implements UserDAO {
	
	
	public User selectById(Long id) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		User customer = (User) session.get(User.class, id);
		session.close();
		return customer;
	}

	/*
	 * retrieves all customers from db
	 * 
	 * @return List of customers
	 */
	public List<User> selectAll() {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<User> customers = session.createCriteria(User.class).list();
		session.close();
		return customers;
	}

	/*
	 * inserts a new customer in database retrieves generated id and sets to
	 * customer instance
	 * 
	 * @param new customer
	 */
	public void insert(User user) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Long id =  (Long) session.save(user);
		user.setId(id);
		session.getTransaction().commit();
		session.close();
	}
	/*
	 * updates customer
	 * @param customer to update
	 */
	public void update(User customer) {
		
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.merge(customer);
		session.getTransaction().commit();
		session.close();
		
	}

	/*
	 * delete given customer
	 * 
	 * @param customer to delete
	 */
	public void delete(User customer) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(customer);
		session.getTransaction().commit();
		session.close();
	}
	
	
	
	
	
	
	
	

}
