package com.universityscreaning.DaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.universityscreaning.Dao.UniversityDao;
import com.universityscreaning.ResultSetExtractors.UniversityResultSetExtractor;
import com.universityscreaning.RowMappers.ReviewRowMapper;
import com.universityscreaning.RowMappers.UniversityRowMapper;
import com.universityscreaning.model.Review;
import com.universityscreaning.model.University;

@Repository
public class UniversityDaoImpl implements UniversityDao {

	
	
	@Autowired
	private JdbcTemplate jdbc;
	
	@Autowired
	private ReviewDaoImpl reviewsConn;
	
	
	

	@Override
	public University getUniversity(int id) {
		String sql="Select * from universities where id = "+id ;
		System.out.println(sql+" here I am");
		
		University uni=jdbc.query(sql,new UniversityResultSetExtractor());
		List<Review> reviews=reviewsConn.getOneUniversityReviews(uni.getId());
		uni.setReviews(reviews);
		
		System.out.println(uni);
		return uni;
	}


	@Override
	public void createUniversity(University uni) {
		String sql="insert into universities (name,address,body,creditfee,Divison) values('"+uni.getName()+"','"+uni.getAddress()+"','"+uni.getBody()+"',"+uni.getFee()+",'"+uni.getDivision()+"');";
		System.out.println(sql);
		jdbc.update(sql);

	}

	@Override
	public void updateUniversity(University uni) {
		// TODO Auto-generated method stub
		String sql="update universities set name='"+uni.getName()+"',address='"+uni.getAddress()+"',body='"+uni.getBody()+"',Division='"+uni.getDivision()+"' where id ="+uni.getId();
		System.out.println(sql);
		jdbc.update(sql);
	}

	@Override
	public void deleteUniversity(University university) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<University> getAll() {
		String sql="Select * from universities";
		List<University> universities=jdbc.query(sql,new UniversityRowMapper());
		return universities;
	}

	@Override
	public List<University> findUni(String name, String division, String curriculam, int max, int min) {
		// TODO Auto-generated method stub
		return null;
	}

}
