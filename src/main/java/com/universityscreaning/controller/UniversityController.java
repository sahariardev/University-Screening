package com.universityscreaning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.SystemPropertyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.universityscreaning.DaoImpl.ReviewDaoImpl;
import com.universityscreaning.DaoImpl.UniversityDaoImpl;
import com.universityscreaning.model.Review;
import com.universityscreaning.model.University;

@Controller
@RequestMapping(value="/uni")
public class UniversityController {
	
	@Autowired
	public UniversityDaoImpl conn;

	
	@RequestMapping(value="" , method=RequestMethod.GET)
	public String test()
	{
		return "home";
	}
	//uniname name stands for university name 
	@RequestMapping(value="/{uniId}" , method=RequestMethod.GET)
	public String showUni(@PathVariable("uniId") int  id, Model model )
	{
		University uni=conn.getUniversity(id);
        /*
		List <Review> reviews=reviewConn.getOneUniversityReviews(uni.getId());
		uni.setReviews(reviews);
		for(Review review : reviews)
		{
			System.out.println(review);
		}*/
		
		if(!uni.isFilled())
		{
			return "403";
		}
		
		model.addAttribute("title",uni.getName());
		model.addAttribute("uni",uni);
		
		return "uni";
	}

}
