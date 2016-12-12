package org.classapp.backend.data;

import java.util.Date;
import java.util.List;

import org.classapp.backend.data.dao.ChatGroupDAO;
import org.classapp.backend.data.dao.roleDao;
import org.classapp.backend.data.impl.ChatGroupDAOHibernate;
import org.classapp.backend.data.impl.HibernateRoleDao;
import org.classapp.backend.data.model.Avatar;
import org.classapp.backend.data.model.ChatGroup;
import org.classapp.backend.data.model.Message;
import org.classapp.backend.data.model.Role;
import org.classapp.backend.data.model.User;



public class App 
{

    public static void main( String[] args )
    {
    	ChatGroup chatGroup1 = new ChatGroup();
		chatGroup1.setName("Sample ChatGroup name");
		chatGroup1.setDescription("ChatGroup description");
		
		User user1 = new User();
		user1.setUsername("john_doe");
		user1.setPassword("secret");
		user1.setEmail("jdoe@no-one.no");
		
		Message message1 = new Message();
		message1.setContent("Hello World");
		message1.setMessageDate(new Date());
		message1.setUser(user1);
		
		chatGroup1.getUsers().add(user1);
		chatGroup1.getMessages().add(message1);
		
		ChatGroupDAO chatGroupDAO = new ChatGroupDAOHibernate();
		
		chatGroupDAO.insert(chatGroup1);
		
		System.out.println("User: " + user1);
		System.out.println("Message: " + message1);
		
		chatGroup1.setName("name, changed");
		chatGroupDAO.update(chatGroup1);
		
		System.out.println(chatGroupDAO.selectAll(ChatGroup.class).toString());
    	
    }
}
