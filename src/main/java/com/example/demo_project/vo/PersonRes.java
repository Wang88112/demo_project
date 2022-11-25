package com.example.demo_project.vo;

import java.util.List;

import com.example.demo_project.entity.Person;

public class PersonRes {
	
	private  List<Person> personList;
	
	
	public PersonRes() {
		
	}
	
	public PersonRes(List<Person> personList) {
		this.personList = personList;
	}

	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}
	

}
