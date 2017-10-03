package com.universityscreaning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import com.universityscreaning.DaoImpl.NewsDaoImpl;
import com.universityscreaning.DaoImpl.UniversityDaoImpl;
import com.universityscreaning.Exceptions.FormDataNotFoundException;
import com.universityscreaning.model.News;
import com.universityscreaning.model.University;

@Controller
@RequestMapping("/admin2")
public class AdminController {
	
	
	@Autowired
	UniversityDaoImpl ujdbc;
	@Autowired
	NewsDaoImpl njdbc;
	@RequestMapping(value="/addUni" , method=RequestMethod.GET)
	public String showUniversityInsertionForm()
	{
		
		
		   return "Admin/adduni";
		
		
	}
	
	@RequestMapping(value="/addUni" , method=RequestMethod.POST)
	public String addUniversity(WebRequest request, Model model) throws FormDataNotFoundException
	{
		
     
		University uni=new University();
		uni.setName(request.getParameter("name"));
		uni.setBody(request.getParameter("body"));
		uni.setAddress(request.getParameter("address"));
		uni.setDivision(request.getParameter("divison"));
		uni.setFee(Integer.parseInt(request.getParameter("fees")));
		
		if(uni.getName().length()==0|| uni.getAddress().length()==0 || uni.getBody().length()==0|| uni.getDivision().length()==0|| uni.getFee()== 0)
		{
			throw new FormDataNotFoundException();
		}
		
		ujdbc.createUniversity(uni);
		
	    model.addAttribute("message","Sucessfully one university added named as "+uni.getName());
		return "Admin/adduni";
	}
	
	@RequestMapping(value="/addNews" ,method=RequestMethod.GET)
	public String showNewsInsertionForm(Model model)
	{
		
		
		model.addAttribute("universities",ujdbc.getAll());
		return "Admin/addNews";
	}
	@RequestMapping(value="/addNews" ,method=RequestMethod.POST)
	public String addNews(WebRequest request,Model model)
	{
		
		
	   News n=new News();
	   n.setUni_id(Integer.parseInt(request.getParameter("uni_id")));
	   n.setText(request.getParameter("body"));
	   n.setTitle(request.getParameter("name"));
	   njdbc.addNews(n);
	  
	   
	   
	   
		model.addAttribute("message","Successfully added one");
		model.addAttribute("universities",ujdbc.getAll());
		return "Admin/addNews";
	}
	
	
	@RequestMapping(value="/allUni")
	public String showAlluni(Model model)
	{
		model.addAttribute("universities",ujdbc.getAll());
		return "Admin/allUni";
	}
	
	@RequestMapping(value="/allnews")
	public String showAllnews(Model model)
	{
		
	    model.addAttribute("Newses",njdbc.getAllNews());
		return "Admin/allnews";
	}

}
