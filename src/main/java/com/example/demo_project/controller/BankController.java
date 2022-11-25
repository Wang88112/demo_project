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
public class BankController { // Controller���~�s������

	@Autowired
	private BankService bankService;

	@PostMapping(value = "/api/createAccount")
	public Bank createAccount(@RequestBody BankReq req)  {
		return bankService.createAccount(req.getAccount());
	}

	@PostMapping(value = "/api/getAmount")
	public BankRes getAmount(@RequestBody BankReq req) {
		return null; // @RequestBody�O���~��JSON���F��s����Mapping(�M��)
	    
		
	}

	@PostMapping(value = "/api/deposit")
	public BankRes deposit(String account, int depositAmount) {
		if (depositAmount < 0) {
			BankRes res = new BankRes();
			res.setMessage("���ڤ��ର�t��!");
			return res;
		}

		if (!StringUtils.hasText(account)) { // hasText�������P�_�ť�(fales)
			BankRes res = new BankRes();
			res.setMessage("�b�ᤣ�ର��!");
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
