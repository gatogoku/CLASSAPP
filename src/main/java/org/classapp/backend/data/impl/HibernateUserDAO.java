package org.classapp.backend.data.impl;

import java.util.List;

import org.classapp.backend.data.dao.UserDAO;
import org.classapp.backend.data.model.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.classapp.backend.data.HibernateUtil;


public class HibernateUserDAO extends GenericDAOHibernate<User> implements UserDAO {

	public User checkLogin(String username, String password) {
		
	
		User user = null;
		try {
			session = HibernateUtil.getSession();
			user = (User) session.createCriteria(User.class)
					.add(Restrictions.eq("username", username))
					.add(Restrictions.eq("password", password)).uniqueResult();
		} catch (HibernateException he) {
			handleException(he);
		} finally {
			session.close();
		}

		return user;
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
