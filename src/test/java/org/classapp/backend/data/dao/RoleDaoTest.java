package org.classapp.backend.data.dao;

import java.util.List;

import org.classapp.backend.data.impl.HibernateRoleDAO;
import org.classapp.backend.data.model.Role;

import junit.framework.TestCase;

public class RoleDaoTest extends TestCase  {
	private RoleDAO roleDAO;
	
	
	
	protected void setUp() throws Exception {
		roleDAO = new HibernateRoleDAO();
	}

	protected void tearDown() throws Exception {
	}

	public final void testSelectById() {
		Role insertRole = new Role(1L,"Admin","Administrator role");
		roleDAO.insert(insertRole);
		Role role = roleDAO.selectById(insertRole.getId(), null);
		
		assertEquals("Select by Id should exist",role.getId(), insertRole.getId());
	}

	public final void testSelectAll() {
		List<Role> roles = roleDAO.selectAll(Role.class);
		int totalElements = 0;
		
		if (null != roles) {
			 totalElements = roles.size();
		}
		
		
		Role insertRole = new Role(1L,"Admin","Administrator role");
		roleDAO.insert(insertRole);
		int totalElementsAfterInsert = roleDAO.selectAll(Role.class).size();
		
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
		roleDAO.update(insertRole);
	
		Role updatedRole = roleDAO.selectById(insertRole.getId(), null);
		
		assertEquals("Role name was changed", updatedName, updatedRole.getName());
	}

	public final void testDelete() {
		Role insertRole = new Role(null,"Admin","Administrator role");
		roleDAO.insert(insertRole);
		
		
		roleDAO.delete(insertRole);
		Role role = roleDAO.selectById(insertRole.getId(), null);
		assertNull("Select by Id with a deleted record id shoud be null",role);
	}

}
