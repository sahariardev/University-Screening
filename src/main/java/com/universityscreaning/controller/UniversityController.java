package com.universityscreaning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import com.universityscreaning.DaoImpl.UniversityDaoImpl;
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
	
	@RequestMapping(value="/search", method=RequestMethod.GET )
	public String search(WebRequest request,Model model)
	{
		String name=request.getParameter("uniname");
		String division=request.getParameter("division");
		int min=Integer.parseInt(request.getParameter("pricerange").split("BBQQ")[0]);
		int max=Integer.parseInt(request.getParameter("pricerange").split("BBQQ")[1]);
		
		List <University> university=conn.findUni(name, division, max, min);
		
		model.addAttribute("message", "Search result for "+name);
        model.addAttribute("universities", university);
		
		return "search";
	}
	@RequestMapping(value="/allUni", method=RequestMethod.GET )
	public String allUni(Model model)
	{
		List <University> universities=conn.getAll();
		model.addAttribute("message", "All Universities");
		model.addAttribute("universities", universities);
		
		return "search";
	}

}
