package com.example.demo_project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo_project.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, String> {

	public List<Person> findByAgeGreaterThan(int age);  //方法名稱依照格式寫
	
	public List<Person> findByNameAndAgeGreaterThan(String name, int age); 
	 //Name跟Age要跟DB欄位一樣才找得到
	public List<Person> findByNameAndAge(String name, int age);
	
	public List<Person> findByCity(String city);
}
