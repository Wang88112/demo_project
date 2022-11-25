package com.example.demo_project.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MenuuReq {
	
	@JsonProperty("name")
    private String name;
	
	@JsonProperty("price")
	private int price;
	
	@JsonProperty("number")
	private int number;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private List<MenuuReq> orderList;
	
	public MenuuReq() {
		
	}
	

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


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public List<MenuuReq> getOrderList() {
		return orderList;
	}


	public void setOrderList(List<MenuuReq> orderList) {
		this.orderList = orderList;
	}

	
}
