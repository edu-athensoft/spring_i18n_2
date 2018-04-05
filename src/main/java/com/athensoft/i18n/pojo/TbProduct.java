package com.athensoft.i18n.pojo;

import java.io.Serializable;

public class TbProduct implements Serializable{

	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(Integer productStatus) {
		this.productStatus = productStatus;
	}
	public Integer getProductAmount() {
		return productAmount;
	}
	public void setProductAmount(Integer productAmount) {
		this.productAmount = productAmount;
	}
	private Integer productId;
	private Integer productStatus;
	private Integer productAmount;
	private TbProducti18n producti18n;
	public TbProducti18n getProducti18n() {
		return producti18n;
	}
	public void setProducti18n(TbProducti18n producti18n) {
		this.producti18n = producti18n;
	}
	public static void main(String[] args) {
		
	}
	
}
