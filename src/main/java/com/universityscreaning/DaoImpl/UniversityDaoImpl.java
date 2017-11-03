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
		String sql="insert into universities (name,address,body,creditfee,Divison,Otherinfo) values('"+uni.getName()+"','"+uni.getAddress()+"','"+uni.getBody()+"',"+uni.getFee()+",'"+uni.getDivision()+"','"+uni.getOtherinfo()+"');";
		System.out.println(sql);
		jdbc.update(sql);

	}

	@Override
	public void updateUniversity(University uni) {
		// TODO Auto-generated method stub

		String sql="update universities set name='"+uni.getName()+"',address='"+uni.getAddress()+"',body='"+uni.getBody()+"',Otherinfo='"+uni.getOtherinfo()+"',creditfee='"+uni.getFee()+"',Divison='"+uni.getDivision()+"' where id ="+uni.getId();

		System.out.println(sql);
		jdbc.update(sql);
	}

	@Override
	public void deleteUniversity(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from universities where id="+id;
		System.out.println(sql);
		jdbc.update(sql);
	}

	@Override
	public List<University> getAll() {
		String sql="Select * from universities";
		List<University> universities=jdbc.query(sql,new UniversityRowMapper());
		return universities;
	}
	

	@Override
	public List<University> findUni(String name, String divison, int max, int min) {
		String sql="Select * from universities where name LIKE '%"+name+"%' and Divison LIKE '%"+divison+"%' and creditfee BETWEEN "+min+" AND "+max;
		System.out.println(sql);
		List<University> universities=jdbc.query(sql,new UniversityRowMapper());
		return universities;
	}

}
