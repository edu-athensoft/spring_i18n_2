package com.athensoft.i18n.controller;

import java.util.ArrayList;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.athensoft.i18n.pojo.TbProduct;
import com.athensoft.i18n.service.ProductService;

@Controller   
@RequestMapping()  
public class ProductController {
	
	@Autowired
	private ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	  @RequestMapping("product")
		public ModelAndView showPage(){
	        ModelAndView mov=new ModelAndView();  
	        
	       ArrayList<TbProduct> productList= (ArrayList<TbProduct>) productService.findAll();
	        
	        mov.setViewName("product");  
	        return mov;  
		}
	
	
}
