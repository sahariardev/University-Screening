package com.universityscreaning.model;

import java.util.List;

public class University {
	
	
	private int id;
	private String name;
	private String body;
	private String address;
	private int fee;
	private String otherinfo;
	private String Division;
	private boolean isFilled=false;
	private List<Review> reviews;
	
	
	public String getOtherinfo() {
		return otherinfo;
	}
	public void setOtherinfo(String otherinfo) {
		this.otherinfo = otherinfo;
	}
	public boolean isFilled() {
		return isFilled;
	}
	public String getlat()
	{
		return otherinfo.split("!!!")[0].split("&&")[0];
	}
	public String getlong()
	{
		return otherinfo.split("!!!")[0].split("&&")[1];
	}
	
	public int [] getScores()
	{
		int arr[]=new int[3];
		
		arr[0]=Integer.parseInt(otherinfo.split("!!!")[1].split("&&")[0]);
		arr[1]=Integer.parseInt(otherinfo.split("!!!")[1].split("&&")[1]);
		arr[2]=Integer.parseInt(otherinfo.split("!!!")[1].split("&&")[2]);
		
		return arr;
	}
	
	
	public String[] getSubjects()
	{
		return otherinfo.split("!!!")[2].split("&&");
	}
	public String uniUrl()
	{
		return otherinfo.split("!!!")[3];
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
		return "/universityscreaning/uni/"+id;
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
				+ ", otherinfo=" + otherinfo + ", Division=" + Division + ", isFilled=" + isFilled + ", reviews="
				+ reviews + "]";
	}
	
	
	
	
	
	

}
