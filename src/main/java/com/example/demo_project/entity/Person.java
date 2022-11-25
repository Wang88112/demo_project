package com.example.demo_project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {
	
	@Id
	@Column(name = "id")  //table裡面的id   //Column為欄位名稱
	private String id;
	
	@Column(name = "name")  //Column為欄位名稱  對應欄位
	private String name;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "living_city")
	private String city;
	
	
	public Person() {
		
	}
	
	public Person(String name, String id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;	
	}

	public Person(int age) {
		this.age = age;	
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
