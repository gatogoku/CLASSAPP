package org.classapp.backend.data.impl;

import java.util.List;

import org.classapp.backend.data.HibernateSession;
import org.classapp.backend.data.dao.roleDao;
import org.classapp.backend.data.model.Role;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class HibernateRoleDao implements roleDao {

	public Role selectById(Long id) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		Role role = (Role) session.get(Role.class, id);
		session.close();
		return role;
		
	}

	public List<Role> selectAll() {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<Role> roles = session.createCriteria(Role.class).list();
		session.close();
		return roles;
	}

	public void insert(Role role) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Long id = (Long) session.save(role);
		role.setId(id);
		session.getTransaction().commit();
		session.close();
		
		
	}

	public void Update(Role role) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.merge(role);
		session.getTransaction().commit();
		session.close();
		
	}

	public void Delete(Role role) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(role);
		session.getTransaction().commit();
		session.close();
		
	}



}
