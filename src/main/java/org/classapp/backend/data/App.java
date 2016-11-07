package org.classapp.backend.data;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.ListIterator;

import org.classapp.backend.data.impl.HibernateUserDAO;
import org.classapp.backend.data.model.Avatar;
import org.classapp.backend.data.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	User user1 = new User(null,"gatogoku","xxyxxy","aqv1793@gmail.com");
    	User user2 = new User(null,"juan","xxyxxy","blabla@gmail.com");
    	User user3 = new User(null,"hey","xxyxxy","hey@gmail.com");
    	
   
    	user1.setAvatar(new Avatar("imagen1","1.jpg"));
    	
    	user2.setAvatar(new Avatar("imagen2","2.jpg"));
    	
    	
    	
    	
    	//HibernateSession session = new HibernateSession();
    	HibernateUserDAO  huserdao = new HibernateUserDAO();
    	
    	
    	//session.getSession();
    	
    	huserdao.insert(user1);
    	huserdao.insert(user2);
    	huserdao.insert(user3);
    	
    	ListIterator<User> it = huserdao.selectAll().listIterator();
    	
    	while(it.hasNext())
    		  System.out.println(it.next().getUsername() + " * " + it.next().getEmail());
    		 
    		
    		
    	
    	
    	
    	
    	//huserdao.update(user3);
    	
    	
    	
    	
    	
    	
    	
    }
}
