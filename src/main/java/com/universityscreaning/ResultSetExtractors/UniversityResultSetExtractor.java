package com.universityscreaning.ResultSetExtractors;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.universityscreaning.DaoImpl.ReviewDaoImpl;
import com.universityscreaning.model.Review;
import com.universityscreaning.model.University;


public class UniversityResultSetExtractor implements ResultSetExtractor<University> {

	
	

	
	@Override
	public University extractData(ResultSet res) throws SQLException, DataAccessException {
		
		University uni = new University();
		if(res.next())
		{
			
	
			uni.setId(res.getInt("id"));
			uni.setName(res.getString("name"));
			uni.setAddress(res.getString("address"));
			uni.setBody(res.getString("body"));
			uni.setFee(res.getInt("creditfee"));
			uni.setDivision(res.getString("Divison"));
			uni.setOtherinfo(res.getString("Otherinfo"));
			uni.setFilled(true);
			
		}
		
	
		
		
		
		
		
		return uni;
	
	}

}
