package com.universityscreaning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.universityscreaning.DaoImpl.NewsDaoImpl;
import com.universityscreaning.model.News;

@Controller
@RequestMapping(value="/news")
public class NewsController {


	@Autowired
	NewsDaoImpl conn;
	@RequestMapping(value="/{newsId}", method=RequestMethod.GET)
	public String showsingle(@PathVariable("newsId") int id,Model model)
	{
		System.out.println("Here on the news section ");
		News n=conn.findNewsById(id);
		model.addAttribute("news", n);
		return "news";
	}
	
	@RequestMapping(value="/allNews", method=RequestMethod.GET)
	public String allNews(Model model)
	{
		
		List<News> newses=conn.getAllNews();
		
		model.addAttribute("newses",newses);
		return "allnews";
	}
	
}
