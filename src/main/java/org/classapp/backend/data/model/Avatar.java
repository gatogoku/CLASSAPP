package org.classapp.backend.data.model;

import javax.persistence.Table;




public class Avatar {
	
	int id;
	String description;
	String image;
	User user;
	
	public Avatar(String description, String image) {
		super();
		
		this.description = description;
		this.image = image;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	

}
