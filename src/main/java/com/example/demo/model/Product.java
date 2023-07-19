package com.example.demo.model;

public class Product {

	private Integer productId ;
	private String productName;
	private Double productPrice;
	private Double productAmount;
	private String productDetail;
	
	
	
	public Product() {
		super();
	}
	public Product(Integer productId, String productName, Double productPrice, Double productAmount,
			String productdetail) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productAmount = productAmount;
		this.productDetail = productdetail;
	}
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
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	public Double getProductAmount() {
		return productAmount;
	}
	public void setProductAmount(Double productAmount) {
		this.productAmount = productAmount;
	}
	public String getProductdetail() {
		return productDetail;
	}
	public void setProductdetail(String productdetail) {
		this.productDetail = productdetail;
	}
	

	
}

