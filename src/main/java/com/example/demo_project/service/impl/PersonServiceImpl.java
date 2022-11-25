package com.example.demo_project.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Person;
import com.example.demo_project.repository.PersonDao;
import com.example.demo_project.service.ifs.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	public PersonDao personDao;

	@Override
	public List<Person> getPersonInfo() {
//		Person person1 = new Person("Harry", "A123", 45);
//		Person person2 = new Person("Ben", "A456", 10);
//		Person person3 = new Person("Lily", "A789", 15);
		
		List<Person> list = personDao.findAll();
		return list;
		//return personDao.findAll();
		//================
//		List<Person> personList = new ArrayList<>();
//		personList.add(person1);
//		personList.add(person2);
//		personList.add(person3);
//		return personList;
	}

	@Override
	public Person getPersonInfoById(String id) {
//		Person person1 = new Person("Harry", "A123", 45);
//		Person person2 = new Person("Ben", "A456", 10);
//		Person person3 = new Person("Lily", "A789", 15);
//		//================
		
		Person person = personDao.findById(id).get();
		return person;
		//return personDao.findById(id).get();
		
//		Person person = new Person();
//		person.setId(personDao.findById(id).get());
//		Person person = personDao.findById(id).get();  為上2行簡化而成
//		return person;
		//============
//		Optional<Person> personOp = personDao.findById(id);  //用Optional把Person包起來
//		if(personOp.isPresent()) {  //用isPresent來判斷有值無值
//			Person per = personOp.get();
//			System.out.println(per.getId());
//			System.out.println(per.getAge());
//			return personOp.get();
//		}else {
//			return new Person();
//		}
		
//		return personOp.orElse(new Person());
		
		//======================================
//		if(id.equalsIgnoreCase(person1.getId())) {
//			return person1;
//		}
//		}else if(id.equalsIgnoreCase(person2.getId())) {
//			return person2;
//		}else if(id.equalsIgnoreCase(person3.getId())) {
//			return person3;
//		}else {
//			return new Person();  //回傳空的Person
//		}
	}

	@Override
	public List<Person> getPersonInfoByAgeLargerThan(int age) {
		UUID uuid = UUID.randomUUID();
        System.out.println("uuid");
//		Person person1 = new Person("Harry", "A123", 45);
//		Person person2 = new Person("Ben", "A456", 10);
//		Person person3 = new Person("Lily", "A789", 15);
		//================
//		List<Person> list = new ArrayList<>();
//		if(person1.getAge() >= age) {
//			list.add(person1);
//		}
//		if(person2.getAge() >= age) {
//			list.add(person2);
//		}
//		if(person3.getAge() >= age) {
//			list.add(person3);
//		}
//		return list;
//	}
	  
	//===============================
//	  List<Person> agelist = new ArrayList<>();
//	  agelist.add(person1);
//	  agelist.add(person2);
//	  agelist.add(person3);
	  //=================
//	  List<Person> personList = personDao.findAll();
//	  
//	  List<Person> newList = new ArrayList<>();
//	  for(Person find : personList) {
//		  if(age < find.getAge()) {
//			  newList.add(find);
//		  }
//	  }
//	return newList;
//
//    }
		//=========================
		List<Person> ageList = personDao.findByAgeGreaterThan(age);
		return ageList;
		
		
  }
	

	@Override
	public List<Person> findByNameAndAge(String name, int age) {
//		List<Person> naList = personDao.findByNameAndAge(name, age);
//		return naList;
		
		//===================findByNameAndAgeGreaterThan
		List<Person> nameageList = personDao.findByNameAndAgeGreaterThan(name, age);
		return nameageList;
	}
		
}
