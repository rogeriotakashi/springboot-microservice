package io.rogeriotakashi.catservice.models;

import java.util.List;

public class Cat {

	private String id;
	
	private String url;
	
	private String width;
	
	private String height;
	
	private List<Breed> breeds;

	
	public Cat() {}


	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}


	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}


	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}


	/**
	 * @return the width
	 */
	public String getWidth() {
		return width;
	}


	/**
	 * @param width the width to set
	 */
	public void setWidth(String width) {
		this.width = width;
	}


	/**
	 * @return the height
	 */
	public String getHeight() {
		return height;
	}


	/**
	 * @param height the height to set
	 */
	public void setHeight(String height) {
		this.height = height;
	}


	/**
	 * @return the breeds
	 */
	public List<Breed> getBreeds() {
		return breeds;
	}


	/**
	 * @param breeds the breeds to set
	 */
	public void setBreeds(List<Breed> breeds) {
		this.breeds = breeds;
	}


	@Override
	public String toString() {
		return "Cat [id=" + id + ", url=" + url + ", width=" + width + ", height=" + height + ", breeds=" + breeds
				+ "]";
	}
}
	

	










	