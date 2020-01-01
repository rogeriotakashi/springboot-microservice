package io.rogeriotakashi.generalpetservice.models;

import java.util.List;

public class Album {

	private List<String> urls;

	public Album() {}

	public Album(List<String> urls) {
		super();
		this.urls = urls;
	}

	/**
	 * @return the urls
	 */
	public List<String> getUrls() {
		return urls;
	}

	/**
	 * @param urls the urls to set
	 */
	public void setUrls(List<String> urls) {
		this.urls = urls;
	}

	@Override
	public String toString() {
		return "Album [urls=" + urls + "]";
	}
	
	
		
	
}
