package com.example.demo_project.service.ifs;

import java.util.List;

import com.example.demo_project.entity.Person;

public interface PersonService {
	
	public List<Person> getPersonInfo();  //所有人資料     
	
	public Person getPersonInfoById(String id);    //要個人id
	
	public List<Person> getPersonInfoByAgeLargerThan(int age);    //比較年齡，筆輸入年齡大的列出
	
	public List<Person> findByNameAndAge(String name, int age);  //年齡姓名一樣

}
