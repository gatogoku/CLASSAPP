package org.classapp.backend.data.model;

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
	public Avatar getAvatar() {
		return avatar;
	}


	public void setAvatar(Avatar avatar) {
		this.avatar = avatar;
	}


	
	
	
	public User(){}
<<<<<<< HEAD
	
	
	public User(String name){
		
=======


	public User(Long id, String username, String password, String email) {
		super();
		this.id =  id;
		this.username = username;
		this.password = password;
		this.email = email;
>>>>>>> refs/remotes/origin/BRANCH_ADRIAN
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
