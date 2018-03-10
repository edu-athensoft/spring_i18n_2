package com.athensoft.i18n.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller   
@RequestMapping()  
public class IndexController {
	
	  @RequestMapping("{page}")
		public ModelAndView showPage(@PathVariable String page){
	        ModelAndView mov=new ModelAndView();  
	        mov.setViewName(page);  
	          
	        return mov;  
		}
}
