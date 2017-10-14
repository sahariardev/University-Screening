package com.universityscreaning.DaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.universityscreaning.Dao.NewsDao;
import com.universityscreaning.ResultSetExtractors.NewsResultSetExtractor;
import com.universityscreaning.RowMappers.NewsRowMapper;
import com.universityscreaning.model.News;

@Repository
public class NewsDaoImpl implements NewsDao {

	
	@Autowired
	JdbcTemplate jdbc;
	@Override
	public void addNews(News n) {
		
		String sql="Insert into news (uni_id,body,title) values("+n.getUni_id()+",'"+n.getText()+"','"+n.getTitle()+"');";
		
		jdbc.update(sql);
		
		
		
		

	}

	@Override
	public void deleteNews(News n) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateNews(News n) {
		String sql="update news set title='"+n.getTitle()+"',body='"+n.getText()+"' where id ="+n.getId();
	    System.out.println(sql);
	    jdbc.update(sql);     
           
	}

	@Override
	public News findNewsById(int id) {
		
		String sql=" Select *  from news where id ="+id+";";
		News news=jdbc.query(sql, new NewsResultSetExtractor());
		
		
		return news;
	}

	@Override
	public List<News> getAllNews() {
		
		String sql="Select * from news";
		
		List<News> l=jdbc.query(sql, new NewsRowMapper());
		
		return l;
		
	}

	@Override
	public List<News> getNewsByUniId(int[] ids) {
		// TODO Auto-generated method stub
		return null;
	}

}
