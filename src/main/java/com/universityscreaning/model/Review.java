package com.universityscreaning.model;

public class Review {
	
	private int id;
	private int user_id;
	private int uni_id;
	private String body;
	private int points;
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getUni_id() {
		return uni_id;
	}
	public void setUni_id(int uni_id) {
		this.uni_id = uni_id;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}

	
	
	@Override
	public String toString() {
		return "Review [id=" + id + ", user_id=" + user_id + ", uni_id=" + uni_id + ", body=" + body + ", points="
				+ points + ", user=" + user + "]";
	}
	public Review(int id, int user_id, int uni_id, String body, int points) {
		
		this.id = id;
		this.user_id = user_id;
		this.uni_id = uni_id;
		this.body = body;
		this.points = points;
	}
	public Review() {
		
	}
	
	
	

}
