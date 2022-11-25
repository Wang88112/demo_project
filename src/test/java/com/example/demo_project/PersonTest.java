package com.example.demo_project;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo_project.entity.Person;
import com.example.demo_project.repository.PersonDao;
import com.example.demo_project.service.ifs.PersonService;

@SpringBootTest
public class PersonTest {
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private PersonDao personDao;
	
	@Test
	public void cheackPerson() {
		List<Person> result = personDao.findByCity("Tainan");
		System.out.println(result.size());
	}

}
