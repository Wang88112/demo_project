package com.example.demo_project.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Bird;
import com.example.demo_project.service.ifs.Active;


@Service
public class Homework implements Active {

	public Bird fly (String name, int age) {
		Bird bird = new Bird();
        bird.setName(name);
        bird.setAge(age);
        
        return bird;
		
	}

	public void birdfly(Bird a) {
		System.out.println(a.getName() + "���b��");
		System.out.println("���~" + a.getAge() +"��");
		
	}

}
