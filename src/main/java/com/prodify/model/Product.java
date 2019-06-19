package com.prodify.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.prodify.repository.ProductRepository;

@Entity
@Table(name="Products")
public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int product_id;
	
	@Column(name="product_name")
	private String product_name ;
	
	@Column(name="product_description")
	private String description;
	
	@Column(name="product_price")
	private int product_price;
	
	public Product() {
		
	}
	
	public Product(String product_name, String description, int product_price) {
		super();
		this.product_name = product_name;
		this.description = description;
		this.product_price = product_price;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}	
}
