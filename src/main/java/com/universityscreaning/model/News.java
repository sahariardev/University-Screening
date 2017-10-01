package com.universityscreaning.model;

public class News {
	
	private int id;
	private int uni_id;
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
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "News [id=" + id + ", uni_id=" + uni_id + ", text=" + text + "]";
	}
	
	

}
