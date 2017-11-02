package com.universityscreaning.model;

import java.util.List;

public class University {
	
	
	private int id;
	private String name;
	private String body;
	private String address;
	private int fee;
	private String Division;
	private boolean isFilled=false;
	private List<Review> reviews;
	
	public boolean isFilled() {
		return isFilled;
	}
	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getAddress() {
		return address;
	}
	public String getUrl()
	{
		return "/uni/"+id;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String getDivision() {
		return Division;
	}
	public void setDivision(String division) {
		Division = division;
	}
	public List<Review> getReviews() {
		return reviews;
	}
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", body=" + body + ", address=" + address + ", fee=" + fee
				+ ", Division=" + Division + ", isFilled=" + isFilled + ", reviews=" + reviews + "]";
	}
	
	
	
	
	

}
