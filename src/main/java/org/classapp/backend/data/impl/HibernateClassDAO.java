package org.classapp.backend.data.impl;

import java.util.List;

import org.classapp.backend.data.dao.ClassDAO;
import org.classapp.backend.data.model.Class;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.classapp.backend.data.HibernateSession;

public class HibernateClassDAO implements ClassDAO {
	/*
	 * selects one userRole by Id
	 * 
	 * @param id
	 * 
	 * @return class
	 */
	public Class selectById(Long id) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		Class aClass = (Class) session.get(Class.class, id);
		session.close();
		return aClass;
	}

	/*
	 * retrieves all classes from db
	 * 
	 * @return List of classes
	 */
	public List<Class> selectAll() {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<Class> aClass = session.createCriteria(Class.class).list();
		session.close();
		return aClass;
	}

	/*
	 * inserts a new class in database retrieves generated id and sets to
	 * customer instance
	 * 
	 * @param new class
	 */
	public void insert(Class aClass) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Long id = (Long) session.save(aClass);
		aClass.setId(id);
		session.getTransaction().commit();
		session.close();
	}

	/*
	 * updates class
	 * 
	 * @param class to update
	 */
	public void update(Class aClass) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.merge(aClass);
		session.getTransaction().commit();
		session.close();
	}

	/*
	 * delete given class
	 * 
	 * @param class to delete
	 */
	public void delete(Class aClass) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(aClass);
		session.getTransaction().commit();
		session.close();
	}
}
