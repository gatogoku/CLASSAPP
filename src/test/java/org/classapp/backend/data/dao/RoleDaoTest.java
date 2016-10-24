package org.classapp.backend.data.dao;

import org.classapp.backend.data.impl.HibernateRoleDao;
import org.classapp.backend.data.model.Role;

import junit.framework.TestCase;

public class RoleDaoTest extends TestCase {
	private roleDao roleDAO;
	
	
	protected void setUp() throws Exception {
		roleDAO = new HibernateRoleDao();
	}

	protected void tearDown() throws Exception {
	}

	public final void testSelectById() {
		Role insertRole = new Role(null,"Admin","Administrator role");
		roleDAO.insert(insertRole);
		Role role = roleDAO.selectById(insertRole.getId());
		assertEquals("Select by Id should exist",role.getId(), insertRole.getId());
	}

	public final void testSelectAll() {
		int totalElements = roleDAO.selectAll().size();
		
		Role insertRole = new Role(null,"Admin","Administrator role");
		roleDAO.insert(insertRole);
		int totalElementsAfterInsert = roleDAO.selectAll().size();
		
		assertEquals("Select All returns all elements",totalElements + 1, totalElementsAfterInsert);
	}

	public final void testInsert() {
		assertTrue("Insert",true);
	}

	public final void testUpdate() {
String updatedName = "Admin changed";
		
	
		Role insertRole = new Role(null,"Admin","Administrator role");
		roleDAO.insert(insertRole);
		

		insertRole.setName(updatedName);
		roleDAO.Update(insertRole);
	
		Role updatedRole = roleDAO.selectById(insertRole.getId());
		
		assertEquals("Role name was changed", updatedName, updatedRole.getName());
	}

	public final void testDelete() {
		Role insertRole = new Role(null,"Admin","Administrator role");
		roleDAO.insert(insertRole);
		
		
		roleDAO.Delete(insertRole);
		Role role = roleDAO.selectById(insertRole.getId());
		assertNull("Select by Id with a deleted record id shoud be null",role);
	}

}
