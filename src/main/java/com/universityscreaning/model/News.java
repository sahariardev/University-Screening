package com.universityscreaning.model;

public class News {
	
	private int id;
	private int uni_id;
	private String title;
	private String date;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	private String text;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUni_id() {
		return uni_id;
	}
	public void setUni_id(int uni_id) {
		this.uni_id = uni_id;
	}
	public String getText() {
		return text;
	}
	public String getUrl()
	{
		return "/news/"+id;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "News [id=" + id + ", uni_id=" + uni_id + ", title=" + title + ", text=" + text + "]";
	}
	
	
	

}
