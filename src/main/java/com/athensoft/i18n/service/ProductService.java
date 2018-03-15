package com.athensoft.i18n.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.athensoft.i18n.dao.ProductDao;
import com.athensoft.i18n.pojo.TbProduct;

@Service
public class ProductService {

	@Autowired
	@Qualifier("productDaoImpl")
	private ProductDao productDao;

	public void setPostDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	public List<TbProduct> findAll(){
		return productDao.findAll();
	}
	
}
