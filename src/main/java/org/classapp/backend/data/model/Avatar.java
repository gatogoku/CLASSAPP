package org.classapp.backend.data.model;

public class Avatar {

	private Long id;
	private String description;
	private String image;
	private User user;
	/**
	 * @param id
	 * @param description
	 * @param image
	 */
	public Avatar(Long id, String description, String image) {
		this.id = id;
		this.description = description;
		this.image = image;
	}
	/**
	 * 
	 */
	public Avatar() {
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
