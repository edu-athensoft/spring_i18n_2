package com.athensoft.i18n.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller   
@RequestMapping("/user")  
public class UserController {
	
	  @RequestMapping(value="/save",method=RequestMethod.GET)  
	    public ModelAndView  save(String name,String password)  
	    {  
	        System.out.println("���յ����û���Ϣ��"+name);  
	          
	        ModelAndView mov=new ModelAndView();  
	        mov.setViewName("/saveUserSuccess");  
	        mov.addObject("msg", "����ɹ���");  
	          
	        return mov;  
	    }  
}