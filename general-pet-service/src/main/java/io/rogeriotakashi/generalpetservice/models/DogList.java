package io.rogeriotakashi.generalpetservice.models;

import java.util.List;

public class DogList {
	private List<String> message;
	private String status;
	/**
	 * @return the message
	 */
	public List<String> getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(List<String> message) {
		this.message = message;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "DogList [status=" + status + "]";
	}
	
	
}
