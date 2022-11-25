package com.example.demo_project.vo;

import java.util.List;

import com.example.demo_project.entity.Person;

public class PersonAgeRes {
	
	private List<Person> list;
	
	public PersonAgeRes() {
		
	}
	
    public PersonAgeRes(List<Person> list) {
		this.list = list;
	}

	public List<Person> getList() {
		return list;
	}

	public void setList(List<Person> list) {
		this.list = list;
	}
	
	
}
