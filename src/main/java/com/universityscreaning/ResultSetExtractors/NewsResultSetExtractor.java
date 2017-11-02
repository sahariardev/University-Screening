package com.universityscreaning.ResultSetExtractors;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.universityscreaning.model.News;

public class NewsResultSetExtractor implements ResultSetExtractor<News> {

	@Override
	public News extractData(ResultSet res) throws SQLException, DataAccessException {
	
		
		News news=new News();
		while(res.next())
		{
		
		System.out.println("Here I am "+res.getInt("id"));
		
		
		news.setId(res.getInt("id"));
		news.setText(res.getString("body"));
		news.setTitle(res.getString("title"));
		news.setUni_id(res.getInt("uni_id"));
		
		}
		
		return news;
	}

}
