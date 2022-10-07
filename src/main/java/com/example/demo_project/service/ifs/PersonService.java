package com.example.demo_project.service.ifs;

import com.example.demo_project.entity.Person;

public interface PersonService {
    public Person getPersonInfo(String id);  //不同package
        
//    default Person getPersonInfo2() {
//    	return new Person();
//    }                          //只有權限是default才能實作它
    
        
}
