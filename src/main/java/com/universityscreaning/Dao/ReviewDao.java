package com.universityscreaning.Dao;

import java.util.List;

import com.universityscreaning.model.Review;

public interface ReviewDao {

	
	public void addReview(Review r);
	public void updateReview(Review r);
	public void deleteReview(Review r);
    public List<Review> getAllreviews();
    public List<Review> getOneUniversityReviews(int uni_id);
    public List<Review> getAllreviewsByUser(int user_id);
    public Review findNewsById();
	
	
}
