package com.example.demo_project;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo_project.entity.Bird;
//import com.example.demo_project.entity.Person;
//import com.example.demo_project.service.ifs.PersonService;
import com.example.demo_project.service.impl.Homework;
//import com.example.demo_project.service.impl.Homework;
//import com.example.demo_project.service.impl.PersonServiceImpl;

@SpringBootApplication
public class DemoProjectApplication {

//	@Autowired
//	private PersonService personService; //null

	
	public static void main(String[] args) {
//		SpringApplication.run(DemoProjectApplication.class, args);
		Homework work = new Homework();
		Bird bird = work.fly("Hi", 2);
		work.birdfly(bird);
		
		Bird bird1 = work.fly("ABC", 1);
		work.birdfly(bird1);
		

		
		
		
//		
//		PersonServiceImpl personservice = new PersonServiceImpl();
//		Person per = personservice.getPersonInfo("PPP");
//		personservice.printPersonAttributes(per);
	}

}
