package com.example.demo_project.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MenuuRes {

	private String name;

	private int price;

	private String message;


	@JsonProperty(value = "ÁÊ¶R©ú²Ó")
	private List<MenuuReq> orderList;

//	@JsonInclude(JsonInclude.Include.NON_NULL)
//	private int number;
//	
	public MenuuRes() {

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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}



	public List<MenuuReq> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<MenuuReq> orderList) {
		this.orderList = orderList;
	}

}
