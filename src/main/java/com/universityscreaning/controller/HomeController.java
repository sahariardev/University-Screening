package com.universityscreaning.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.universityscreaning.DaoImpl.UserDaoImpl;
import com.universityscreaning.model.User;

@Controller
public class HomeController {

	@Autowired
	private UserDaoImpl usr;
	
	@RequestMapping(value="/" , method=RequestMethod.GET)
	public String showHome()
	{
		
		 /*
		
		 List <User> users=usr.getAllUser();
		for(User user:users)
		{
			System.out.println("Here-------- "+user);
		}
		
		System.err.println("-----------------Hello World----------------------");
		*/
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
	
}
