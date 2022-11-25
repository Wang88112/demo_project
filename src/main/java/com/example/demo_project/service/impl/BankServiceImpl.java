package com.example.demo_project.service.impl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Bank;
import com.example.demo_project.repository.BankDao;
import com.example.demo_project.service.ifs.BankService;

//import com.example.demo_project.vo.BankReq;

@Service
public class BankServiceImpl implements BankService {

	@Autowired
	public BankDao bankDao;

	@Override
	public Bank createAccount(String account) {
		Bank bank = new Bank();
		if (bankDao.existsById(account)) { // 判斷Id是否有實體值
			return null; // 有值回傳空
		} else {
			bank.setAccount(account);
			bank.setAmount(0);
			return bankDao.save(bank);
		}
	}

	@Override // 取得帳戶資訊
	public Bank getAmount(String account) {
		Optional<Bank> bankOp = bankDao.findById(account); // 用Optional把Bank包起來

		if (bankOp.isPresent()) { // 用isPresent來判斷有值無值
			Bank bank = bankOp.get();
			return bank;
		}
		return new Bank();
	}

	@Override
	public Bank deposit(String account, int depositAmount) {

		return null;

	}

	@Override
	public Bank withdraw(String account, int withdrawAmount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(rollbackOn = Exception.class)
	@Override
	public Bank createAccount1(String account) throws Exception {
		Bank bankItem = new Bank(account, 0);
		Bank resBank = bankDao.save(bankItem);

		return resBank;
	}

//	@Transactional
	@Override
	public void deleteByName(String name) throws RuntimeException {
		bankDao.deleteByName(name);
		System.out.println("Deleted name success!");
//		throw new RuntimeException("Create account Error!");
	}

	@Override
	public void deleteById(String account) throws RuntimeException {
		bankDao.deleteById(account);

	}

}


