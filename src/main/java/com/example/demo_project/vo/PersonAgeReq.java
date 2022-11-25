package com.example.demo_project.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonAgeReq {
	
	@JsonProperty("age")
	private int age;
	
	public PersonAgeReq() {
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
