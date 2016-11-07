package org.classapp.backend.data;

import java.util.List;

import org.classapp.backend.data.dao.RoleDao;
import org.classapp.backend.data.impl.HibernateRoleDao;
import org.classapp.backend.data.model.Role;


public class App 
{
	public static void showAll(RoleDao roleDao){
		List<Role> roles = roleDao.selectAll();
		for (Role role:roles){
			System.out.println(role.getName());
		}
	}
    public static void main( String[] args )
    {
    RoleDao roleDao = (org.classapp.backend.data.dao.RoleDao) new HibernateRoleDao();
    showAll(roleDao);
    Role newRole = new Role(1L, "uno", "uno");
    roleDao.insert(newRole);
    showAll(roleDao);
    
    roleDao.Delete(newRole);
    newRole.setName("dos");
    roleDao.Update(newRole);
    }
}
