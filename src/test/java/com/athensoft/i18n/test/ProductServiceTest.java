package com.athensoft.i18n.test;


import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.athensoft.i18n.pojo.TbProduct;
import com.athensoft.i18n.service.ProductService;


@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations={"classpath*:/spring/spring.xml","classpath*:/spring/application_spring_mvc.xml"})  
public class ProductServiceTest {

	 private MockHttpServletRequest request;  
	    private MockHttpServletResponse response;  
	    @Autowired  
	    private ProductService productService;   
	    @Before  
	    public void before(){                                                                     
	
	        request = new MockHttpServletRequest();      
	        request.setCharacterEncoding("UTF-8");      
	        response = new MockHttpServletResponse();  
	    }

	    
	    @Test
	    @Transactional
	    @Rollback(true)
	    public void getAll(){
		        ArrayList<TbProduct> product = (ArrayList<TbProduct>) productService.findAll("en-US");
		        
		        for (TbProduct tbProduct : product) {
					System.out.println(tbProduct.getProductId());
				}
		        
			}
	    }
	    
	  
	    
	    
	    

