package org.classapp.backend.data.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;





public class User {
	Long id;
	String username;
	String password;
	String email;
	Avatar avatar;
	
	

	private Set<Role> roles = new HashSet<Role>();
	
	
	
	
public User(){}

	
	
	public User(String name){
		

	}


	public User(Long id, String username, String password, String email) {
		super();
		this.id =  id;
		this.username = username;
		this.password = password;
		this.email = email;


		
		

	}
	
	
	
	/**
	 * @return the avatar
	 */
	public Avatar getAvatar() {
		return avatar;
	}



	/**
	 * @param avatar the avatar to set
	 */
	public void setAvatar(Avatar avatar) {
		this.avatar = avatar;
	}



	/**
	 * @return the roles
	 */
	public Set<Role> getRoles() {
		return roles;
	}


	/**
	 * @param roles the roles to set
	 */
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}


	



	
	
	
	


	public Long getId() {
		return id;
	}


	public void setId(Long id2) {
		id = id2;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	
	
	

	
	

}
