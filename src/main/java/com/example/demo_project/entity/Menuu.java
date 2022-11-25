package com.example.demo_project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  //�ŧi������A��SpringBoot���D
@Table(name = "menu")  //�s���bDB�����i��
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
