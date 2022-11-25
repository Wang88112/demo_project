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
		if (bankDao.existsById(account)) { // �P�_Id�O�_�������
			return null; // ���Ȧ^�Ǫ�
		} else {
			bank.setAccount(account);
			bank.setAmount(0);
			return bankDao.save(bank);
		}
	}

	@Override // ���o�b���T
	public Bank getAmount(String account) {
		Optional<Bank> bankOp = bankDao.findById(account); // ��Optional��Bank�]�_��

		if (bankOp.isPresent()) { // ��isPresent�ӧP�_���ȵL��
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


