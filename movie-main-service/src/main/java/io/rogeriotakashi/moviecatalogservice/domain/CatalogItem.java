package io.rogeriotakashi.moviecatalogservice.domain;

public class CatalogItem {

	private String name;
	private String overview;
	private int rating;
	
	
	public CatalogItem(String name, String overview, int rating) {
		super();
		this.name = name;
		this.overview = overview;
		this.rating = rating;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the overview
	 */
	public String getOverview() {
		return overview;
	}

	/**
	 * @param overview the overview to set
	 */
	public void setOverview(String overview) {
		this.overview = overview;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "CatalogItem [name=" + name + ", desc=" + overview + ", rating=" + rating + "]";
	}
	
	
}
