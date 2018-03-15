package com.athensoft.i18n.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.athensoft.i18n.pojo.TbProduct;
import com.athensoft.i18n.service.ProductService;


@Repository
@Qualifier("productDaoImpl")
public class ProductDaoImpl implements ProductDao{
	

	private NamedParameterJdbcTemplate jdbc;

	@Autowired
	public void setDataSource(DataSource dataSource){
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	

	public ArrayList<TbProduct> findAll() {
		
		String sql = "select * from product ";
		System.out.println(jdbc.toString());
		
	/* jdbc.queryForList(sql, paramSource)t(sql);
		
		for (Map<String, Object> map : queryForList) {
			Set<Entry<String, Object>> entrySet = map.entrySet();
			for (Entry<String, Object> entry : entrySet) {
				System.out.println(entry.getValue());
			}
		}*/
		return null;
	}

}
