package com.example.demo_project.service.ifs;

import com.example.demo_project.entity.Bank;


public interface BankService {

	public Bank createAccount(String account);  //建立帳號
	
	public Bank getAmount(String account);  //取得帳號
	
	public Bank deposit(String account, int depositAmount);  //存款
	
	public Bank withdraw(String account, int withdrawAmount);  //提款
	
	public Bank createAccount1(String account) throws Exception; 
	
	public void deleteById(String account) throws RuntimeException; 
	
	public void deleteByName(String name) throws RuntimeException;
}
