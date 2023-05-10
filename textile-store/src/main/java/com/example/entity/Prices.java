package com.example.entity;

import org.hibernate.annotations.Table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Prices {
	
	@Column  
	private Integer brand_id;
	@Column  
	private String start_date;
	@Column  
	private String end_date;
	@Column  
	private Integer price_list;
	@Column  
	private Integer product_id;
	@Column  
	private Integer priority;
	@Column  
	private Double price;
	@Column  
	private String curr;
	
	public Integer getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(Integer brand_id) {
		this.brand_id = brand_id;
	}

	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public Integer getPrice_list() {
		return price_list;
	}
	public void setPrice_list(Integer price_list) {
		this.price_list = price_list;
	}
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getCurr() {
		return curr;
	}
	public void setCurr(String curr) {
		this.curr = curr;
	}
	
	public Prices() {}

	public Prices(Integer brand_id, String start_date, String end_date, Integer price_list, Integer product_id,
			Integer priority, Double price, String curr) {
		super();
		this.brand_id = brand_id;
		this.start_date = start_date;
		this.end_date = end_date;
		this.price_list = price_list;
		this.product_id = product_id;
		this.priority = priority;
		this.price = price;
		this.curr = curr;
	}
			
}

