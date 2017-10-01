package com.universityscreaning.RowMappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.universityscreaning.model.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int arg1) throws SQLException {
		
		User usr=new User();
		
		usr.setId(rs.getInt("id"));
		usr.setEmail(rs.getString("email"));
		usr.setName(rs.getString("name"));
		usr.setPassword(rs.getString("password"));
		System.out.println(usr);
		return usr;
	}

}
