package com.universityscreaning.ResultSetExtractors;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.universityscreaning.model.User;

public class UserResultSetExtractor implements ResultSetExtractor<User> {

	@Override
	public User extractData(ResultSet res) throws SQLException, DataAccessException {
		
		User usr=new User();
		
		if(res.next())
		{
			usr.setId(res.getInt(1));
			usr.setName(res.getString(2));
			usr.setEmail(res.getString(4));
		}
		
		
		return usr;
	}

}
