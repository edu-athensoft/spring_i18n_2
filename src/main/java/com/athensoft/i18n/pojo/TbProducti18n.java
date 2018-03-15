package com.athensoft.i18n.pojo;

import java.io.Serializable;

public class TbProducti18n implements Serializable{
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getProductSpecific() {
		return productSpecific;
	}
	public void setProductSpecific(String productSpecific) {
		this.productSpecific = productSpecific;
	}
	public String getProductLocale() {
		return productLocale;
	}
	public void setProductLocale(String productLocale) {
		this.productLocale = productLocale;
	}
	private Integer productId;
	private String productName;
	private String productDesc;
	private String productSpecific;
	private String productLocale;
}
