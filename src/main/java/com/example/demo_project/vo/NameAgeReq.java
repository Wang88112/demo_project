package com.example.demo_project.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NameAgeReq {
  
	@JsonProperty("NameAge")
	private String name;
	private int age;
	
	public NameAgeReq() {
		
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
	
	
}
