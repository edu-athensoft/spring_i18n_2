package com.athensoft.i18n.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
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
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.athensoft.i18n.pojo.TbProduct;
import com.athensoft.i18n.pojo.TbProducti18n;
import com.athensoft.i18n.service.ProductService;

import oracle.net.aso.b;


@Repository
@Qualifier("productDaoImpl")
public class ProductDaoImpl implements ProductDao{
	

	private NamedParameterJdbcTemplate jdbc;

	@Autowired
	public void setDataSource(DataSource dataSource){
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	

	public ArrayList<TbProduct> findAll(String localeStr) {
		String sql = "select * from product p "
				+ ",product_i18n p18"
				+ ",info_language lang"
				+ " where p.id = p18.id "
				+ "and p18.lang_no= lang.lang_no"
				+ " and lang.lang_code='"+localeStr+"'";
		System.out.println(sql);
	List<TbProduct> productList =  jdbc.query(sql, new ProductRowMapper());
		
		 for (TbProduct tbProduct : productList) {
				System.out.println("productId "+tbProduct.getProductId());
			}
	
		return (ArrayList<TbProduct>) productList;
	}
	
	public class ProductRowMapper implements RowMapper<TbProduct>{

		public TbProduct mapRow(ResultSet rs, int number) throws SQLException {
		
			System.out.println("row number "+ number);
			TbProduct product = new TbProduct();
			product.setProductAmount(rs.getInt("product_amount"));
			product.setProductId(rs.getInt("product_id"));
			product.setProductStatus(rs.getInt("product_status"));
			TbProducti18n producti18n = new TbProducti18n();
			producti18n.setProductDesc(rs.getString("product_desc"));
			producti18n.setProductLocale(rs.getString("lang_no"));
			producti18n.setProductSpecific(rs.getString("product_specific"));
			producti18n.setProductName(rs.getString("product_name"));
			producti18n.setProductId(product.getProductId());
			product.setProducti18n(producti18n);
			
			return product;
		}
		
	}

}
