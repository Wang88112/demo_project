package com.example.demo_project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  //宣告為實體，給SpringBoot知道
@Table(name = "menu")  //連結在DB的哪張表
public class Menuu {
	
	@Id
	@Column(name = "name")
	private String name;
	
	@Column(name = "price")
	private int price;
	
//	@Column(name = "number")
//	private Integer number;
	
	public Menuu() {
		
	}
	
    public Menuu(String name, int price) {
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

//	public Integer getNumber() {
//		return number;
//	}
//
//	public void setNumber(Integer number) {
//		this.number = number;
//	}

	
}
