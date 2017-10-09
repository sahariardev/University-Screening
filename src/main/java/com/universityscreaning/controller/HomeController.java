package com.universityscreaning.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import com.universityscreaning.DaoImpl.UniversityDaoImpl;
import com.universityscreaning.DaoImpl.UserDaoImpl;
import com.universityscreaning.model.University;

@Controller
public class HomeController {

	@Autowired
	private UserDaoImpl usr;
	@Autowired
	private UniversityDaoImpl uni; 
	
	@RequestMapping(value="/" , method=RequestMethod.GET)
	public String showHome(WebRequest request, Principal p)
	{
		

		
		
		
		
		System.out.println(p);
		return "home";
	}
	
	
	
	
	@RequestMapping(value="/admin" ,method=RequestMethod.GET)
	public String showAdmin()
	{
		return "admin";
	}
	
	@RequestMapping(value="/403" ,method=RequestMethod.GET)
	public String showError()
	{
		return "403";
	}
	@RequestMapping(value="/login" , method=RequestMethod.GET)
	public String showlogin()
	{
		
	
		return "login";
	}
	
	@RequestMapping(value="/register" , method=RequestMethod.GET)
	public String showregister()
	{
		
	
		return "register2";
	}
	@RequestMapping(value="/test" , method=RequestMethod.GET)
	public String test()
	{
		
	   
		 University university=uni.getUniversity(1);
		 
		 university.setAddress("Address testing ....");
		 
		 uni.updateUniversity(university);
		 
		return "home";
	}
	
	
}
