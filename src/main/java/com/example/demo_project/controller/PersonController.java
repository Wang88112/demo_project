package com.example.demo_project.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_project.entity.Person;
import com.example.demo_project.service.ifs.PersonService;
import com.example.demo_project.vo.NaReq;
import com.example.demo_project.vo.NameAgeRes;
import com.example.demo_project.vo.PersonAgeReq;
import com.example.demo_project.vo.PersonAgeRes;
import com.example.demo_project.vo.PersonReq;
import com.example.demo_project.vo.PersonRes;

@CrossOrigin
@RestController
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@PostMapping(value = "/api/getPersonInfo")
	public PersonRes getPersonInfo(){
		PersonRes res = new PersonRes();
//		List<Person> list= personService.getPersonInfo();
//		res.setPersonList(list);
		res.setPersonList(personService.getPersonInfo());
		return res;
	}
	
	@PostMapping(value = "/api/getPersonInfoById")
	public Person getPersonInfoById(@RequestBody PersonReq req) {
//		Person person = personService.getPersonInfoById(id);
//		return person;
		return personService.getPersonInfoById(req.getId());
	}
	
	@PostMapping(value = "/api/getPersonInfoByAgeLargerThan")
	public PersonAgeRes getPersonInfoByAgeLargerThan(@RequestBody PersonAgeReq req){
		PersonAgeRes res = new PersonAgeRes();
//		List<Person> list = new ArrayList<>();
//		list = personService.getPersonInfoByAgeLargerThan(age);
		res.setList(personService.getPersonInfoByAgeLargerThan(req.getAge()));
		return res;
    }
	

	@PostMapping(value = "/api/findByNameAndAge")
	public NameAgeRes findByNameAndAge(@RequestBody NaReq req){
		NameAgeRes res = new NameAgeRes();
		res.setList(personService.findByNameAndAge(req.getName(), req.getAge()));
		return res;
	}

}
