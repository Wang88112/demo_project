package com.example.demo_project.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Menu {
	private String name;
	private int price;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Integer number;

	public Menu() {

	}

	public Menu(String name, int price) {  //¤@¦¸º¡¨¬name,price
		this.name = name;
		this.price = price;
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

}
