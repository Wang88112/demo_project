package com.example.demo_project.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo_project.entity.Bank;
import com.example.demo_project.repository.BankDao;
import com.example.demo_project.service.ifs.BankService;
import com.example.demo_project.vo.BankReq;
import com.example.demo_project.vo.BankRes;
import com.example.demo_project.vo.CreatedAccountReq;


@RestController // = @Controller + @ResponesBody
public class BankController { // Controller內外連接介面

	@Autowired
	private BankService bankService;

	@PostMapping(value = "/api/createAccount")
	public Bank createAccount(@RequestBody BankReq req)  {
		return bankService.createAccount(req.getAccount());
	}

	@PostMapping(value = "/api/getAmount")
	public BankRes getAmount(@RequestBody BankReq req) {
		return null; // @RequestBody是讓外面JSON的東西連接到Mapping(映對)
	    
		
	}

	@PostMapping(value = "/api/deposit")
	public BankRes deposit(String account, int depositAmount) {
		if (depositAmount < 0) {
			BankRes res = new BankRes();
			res.setMessage("取款不能為負數!");
			return res;
		}

		if (!StringUtils.hasText(account)) { // hasText能幫忙判斷空白(fales)
			BankRes res = new BankRes();
			res.setMessage("帳戶不能為空!");
			return res;
		}
		return new BankRes();
	}

	@PostMapping(value = "/api/withdraw")
	public Bank withdraw(String account, int withdrawAmount) {
		return null;

	}

	@PostMapping(value = "/api/deleteById")
	public BankRes deleteById(@RequestBody BankReq req) throws Exception {
		bankService.deleteById(req.getAccount());
		return new BankRes(new Bank(), "Success");
	}

	@PostMapping(value = "/api/deleteByName")
	public BankRes deleteByName(@RequestBody BankReq req) throws Exception {
		bankService.deleteByName(req.getName());
		return new BankRes(new Bank(), "Success");
	}

}
