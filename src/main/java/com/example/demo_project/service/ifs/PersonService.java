package com.example.demo_project.service.ifs;

import java.util.List;

import com.example.demo_project.entity.Person;

public interface PersonService {
	
	public List<Person> getPersonInfo();  //�Ҧ��H���     
	
	public Person getPersonInfoById(String id);    //�n�ӤHid
	
	public List<Person> getPersonInfoByAgeLargerThan(int age);    //����~�֡A����J�~�֤j���C�X
	
	public List<Person> findByNameAndAge(String name, int age);  //�~�֩m�W�@��

}
