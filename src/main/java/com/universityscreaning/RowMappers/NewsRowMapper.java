package com.universityscreaning.RowMappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.universityscreaning.model.News;

public class NewsRowMapper implements RowMapper<News> {

	@Override
	public News mapRow(ResultSet res, int arg1) throws SQLException {
		News n=new News();
		n.setUni_id(res.getInt("uni_id"));
		n.setText(res.getString("body"));
		n.setTitle(res.getString("title"));
		
		
		return n;
	}

}
