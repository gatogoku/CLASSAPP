package org.classapp.backend.data.model;

public class Avatar {

	private Integer id;
	private String description;
	private String image;
	/**
	 * @param id
	 * @param description
	 * @param image
	 */
	public Avatar(Integer id, String description, String image) {
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
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
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
	
	
	
}
