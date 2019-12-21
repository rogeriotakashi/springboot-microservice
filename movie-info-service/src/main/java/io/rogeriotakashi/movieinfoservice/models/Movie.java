package io.rogeriotakashi.movieinfoservice.models;

public class Movie {
	private String movieId;
	private String name;
	private String overview;
	
	
	public Movie(String movieId, String name, String overview) {
		super();
		this.movieId = movieId;
		this.name = name;
		this.overview = overview;
	}
	
	/**
	 * @return the movieId
	 */
	public String getMovieId() {
		return movieId;
	}
	/**
	 * @param movieId the movieId to set
	 */
	public void setMovieId(String movieId) {
		this.movieId = movieId;
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
	

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", name=" + name + "]";
	}
	
	
}
