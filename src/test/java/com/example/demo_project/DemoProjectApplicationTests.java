package com.example.demo_project;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo_project.entity.Person;
import com.example.demo_project.repository.PersonDao;


@SpringBootTest
class DemoProjectApplicationTests {
	
//	@Autowired
//	private PersonDao personDao;
//	
//	@Test
//	public void collectionTest() {
//		List<Person> result = personDao.findByCity("Taipei");
//		System.out.println(result.size());
//	}

//	@Autowired
//	private BankService bankService;
	
//	@Autowired
//	private BankController bankController;
	
//	@Test
//	public void contextLoads() {
//		Bank bank = new Bank();
//	    bankService.getAmount(bank);
//	    bankService.deposit(bank, 10);
//	    bankService.withdraw(bank, 600000);
//	}
	
//
//	@Test
//	public void bankControllerTest(){
//		BankReq req = new BankReq();
//		req.setAccount("");
//		BankRes res = bankController.getAmount(req);
//		System.out.println(res.getBank().getAccount());
//		System.out.println(res.getBank().getAmount());
//		System.out.println(res.getMessage()); 
//	}
//	
	
}