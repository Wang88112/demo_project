package com.example.demo_project.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NaReq {
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("age")
	private int age;
	
	public NaReq() {
		
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
