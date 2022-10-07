package com.example.demo_project.service.impl;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Person;
import com.example.demo_project.service.ifs.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	
	
	@Override
	public Person getPersonInfo(String id) {  //Person是型態，指回傳值型態
		Person per = new Person();
		per.setName("Lily");
		per.setId(id);
		per.setCity("Taiwan");
		per.setAge(28);
		
		return per;
	}
	public void printPersonAttributes(Person qaz) {  //Person是呼叫上面定義的Person
		System.out.println(qaz.getName());
		System.out.println(qaz.getId());
		System.out.println(qaz.getCity());
		System.out.println(qaz.getAge());
	}
	
}