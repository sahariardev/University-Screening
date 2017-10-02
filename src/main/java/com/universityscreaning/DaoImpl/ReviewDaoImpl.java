package com.universityscreaning.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.universityscreaning.Dao.ReviewDao;
import com.universityscreaning.RowMappers.ReviewRowMapper;
import com.universityscreaning.model.Review;
import com.universityscreaning.model.User;

@Repository
public class ReviewDaoImpl implements ReviewDao {

	@Autowired
	JdbcTemplate jdbc;
	@Autowired
	UserDaoImpl user_jdbc;
	@Override
	public void addReview(Review r) {
		// TODO Auto-generated method stub

	}
	public String test()
	{
		return "asdsa ddddddddddddddddsa da sdsa d";
	}

	@Override
	public void updateReview(Review r) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteReview(Review r) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Review> getAllreviews() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Review> getOneUniversityReviews(int uni_id) {
		String sql="Select * from reviews where uni_id = "+uni_id;
		
		List <Review> reviews_s=jdbc.query(sql,new ReviewRowMapper());
		List<Review> reviews=new ArrayList<Review>();
		for(Review r:reviews_s)
		{
			int u_id=r.getUser_id();	
			User u=user_jdbc.getUser(u_id);
			r.setUser(u);
			reviews.add(r);
		}
		
		return reviews;
	}

	@Override
	public List<Review> getAllreviewsByUser(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Review findNewsById() {
		// TODO Auto-generated method stub
		return null;
	}

}
