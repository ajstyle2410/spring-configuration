package com.order.model;



public class Product {

	private long productId;
	private String productCode;
	private int quantity;
	private long price;
	private String imageUrl;
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public Product(String productCode, int quantity, long price, String imageUrl) {
		super();
		this.productCode = productCode;
		this.quantity = quantity;
		this.price = price;
		this.imageUrl = imageUrl;
	}
	
	
	public Product()
	{
		super();
	}
}
