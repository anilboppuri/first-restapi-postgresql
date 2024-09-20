package com.capgemini.boot1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pgproduct")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productId;
	private String brand;
	private String description;
	private int qty;
	private double price;
	
	public Product() {
	}
	
	public Product(long productId, String brand, String description, int qty, double price) {
		super();
		this.productId = productId;
		this.brand = brand;
		this.description = description;
		this.qty = qty;
		this.price = price;
	}
	
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", brand=" + brand + ", description=" + description + ", qty=" + qty
				+ ", price=" + price + "]";
	}
	
	
	
	
}
