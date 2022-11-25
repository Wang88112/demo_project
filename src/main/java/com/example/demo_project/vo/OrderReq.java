package com.example.demo_project.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderReq {   //½Ð¨D
	
	@JsonProperty("order")
	private String name;
	
	private int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
