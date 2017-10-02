package com.universityscreaning.RowMappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.universityscreaning.model.University;

public class UniversityRowMapper implements RowMapper<University> {

	@Override
	public University mapRow(ResultSet res, int arg1) throws SQLException {
		
		University uni=new University();
		
		uni.setId(res.getInt("id"));
		uni.setName(res.getString("name"));
		uni.setAddress(res.getString("address"));
		uni.setBody(res.getString("body"));
		uni.setFee(res.getInt("creditfee"));
		uni.setDivision(res.getString("Divison"));
		
		return uni;
	}
	

}
