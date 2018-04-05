package com.athensoft.i18n.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;

@Controller   
@RequestMapping()  
public class IndexController {
	
	
	  @RequestMapping("{page}")
		public ModelAndView showPage(@PathVariable String page,HttpServletRequest request){
		  FixedLocaleResolver localeResolver;
	        ModelAndView mov=new ModelAndView();  
	    	        
	      // System.out.println( request.getRequestURL());
	    	mov.setViewName(page);  
	        return mov;  
		}
	
	
}
