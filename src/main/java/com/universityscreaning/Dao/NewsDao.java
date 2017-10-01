package com.universityscreaning.Dao;

import java.util.List;

import com.universityscreaning.model.News;

public interface NewsDao {

	
	
	public void addNews(News n);
	public void deleteNews(News n);
	public void updateNews(News n);
	public News findNewsById(int id);
	public List<News> getAllNews();
	public List<News> getNewsByUniId(int ids []);
	
	
}
