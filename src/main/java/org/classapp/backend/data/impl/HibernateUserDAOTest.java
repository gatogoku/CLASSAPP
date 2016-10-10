package org.classapp.backend.data.impl;

import org.classapp.backend.data.model.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class HibernateUserDAOTest extends TestCase {
	
	
	private HibernateUserDAO  huserdao;
	 User usuario;


	@Before
	public void setUp() throws Exception {
	 huserdao = new HibernateUserDAO();
	}

		@After
		public void tearDown() throws Exception {
		}
		
		
		@Test
		public void testSelectAll() {
			
			int totalElements = huserdao.selectAll().size();
			 User usuario = new User(null,"Admin","pass","xd@mail.com");
				huserdao.insert(usuario);
				
			
			int totalElementsAfterInsert = huserdao.selectAll().size();
			assertEquals("Select All returns all elements",totalElements + 1, totalElementsAfterInsert);
		
		}
		
		public void testSelectById() {		
			//Select after insert
			 //usuario = new User();
		
			 User usuario = new User(null,"Admin","pass","xd@mail.com");
				huserdao.insert(usuario);
			User User = huserdao.selectById(usuario.getId());
			assertEquals("Select by Id should exist",User.getId(), usuario.getId());
			
		}

	
		@Test
		public void testInsert() {
			
			User usuario = new User(null,"Admin","pass","xd@mail.com");
			huserdao.insert(usuario);
		assertTrue("Insert",true);
		}

		@Test
		public void testUpdate() {
			
			 User usuario = new User(null,"Admin","pass","xd@mail.com");
				huserdao.insert(usuario);
			String updatedName = "Admin changed";
			
			// Select after first insert

			// We update the User
			usuario.setUsername(updatedName);
			huserdao.update(usuario);
			
			// Select and check if name has changed
			User updatedUser = huserdao.selectById(usuario.getId());
			assertEquals("User name was changed", updatedName, updatedUser.getUsername());
		}

		@Test
		public void testDelete() {
			// Select after first insert
			User usuario = new User(null,"Admin","pass","xd@mail.com");
			huserdao.insert(usuario);
			
			// Delete 
			huserdao.delete(usuario);
			User User = huserdao.selectById(usuario.getId());
			assertNull("Select by Id with a deleted record id shoud be null",User);
			
		}
		

}

	

	/**
	 * @throws java.lang.Exception
	 */
	

	/**
	 * @throws java.lang.Exception
	

	/**
	 * Test method for {@link io.wzw.backend.data.dao.impl.HibernateUserDAO#selectById(java.lang.Long)}.
	 */
	
	
