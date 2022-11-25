package com.example.demo_project.service.ifs;

import com.example.demo_project.entity.Bank;


public interface BankService {

	public Bank createAccount(String account);  //�إ߱b��
	
	public Bank getAmount(String account);  //���o�b��
	
	public Bank deposit(String account, int depositAmount);  //�s��
	
	public Bank withdraw(String account, int withdrawAmount);  //����
	
	public Bank createAccount1(String account) throws Exception; 
	
	public void deleteById(String account) throws RuntimeException; 
	
	public void deleteByName(String name) throws RuntimeException;
}
