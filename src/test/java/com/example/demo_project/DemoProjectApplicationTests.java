package com.example.demo_project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo_project.entity.Bird;
import com.example.demo_project.entity.Person;
import com.example.demo_project.service.ifs.Active;
import com.example.demo_project.service.ifs.PersonService;

@SpringBootTest
class DemoProjectApplicationTests {

	@Autowired
	private PersonService personService; //¤¶­±
	
	@Test
	public void contextLoads() {
		Person per = personService.getPersonInfo("123123");
		System.out.println(per.getId());
	}
	
	@Autowired
	private Active active; //¤¶­±
	
	@Test
	public void homeWork() {
		Bird bird = active.fly("QQQ", 1);
		System.out.println(bird.getName());
		System.out.println(bird.getAge());
		
		
	}

}
