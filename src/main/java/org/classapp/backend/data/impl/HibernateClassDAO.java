package org.classapp.backend.data.impl;

import org.classapp.backend.data.HibernateUtil;
import org.classapp.backend.data.dao.ClassDAO;
import org.classapp.backend.data.model.Class;
import org.classapp.backend.data.model.User;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;

public class HibernateClassDAO  extends GenericDAOHibernate<Class> implements ClassDAO {

	public Class getUserClassById(Long idUser, Long IdClass) {
		
		Class clase = null;
		
		
		try {
			session = HibernateUtil.getSession();
			clase = (Class) session.createCriteria(Class.class)
					.add(Restrictions.eq("id", idUser))
					.add(Restrictions.eq("id", IdClass)).uniqueResult();
		} catch (HibernateException he) {
			handleException(he);
		} finally {
			session.close();
		}
		
		
		return null;
	}

}
