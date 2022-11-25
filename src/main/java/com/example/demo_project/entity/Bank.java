package com.example.demo_project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  //�ŧi������A��SpringBoot���D
@Table(name = "bank")  //�s���bDB�����i��
public class Bank {        //Bank��entity���S��message
	
	@Id //�D��
	@Column(name = "account")  //Column�ODB���W��
	private String account ;
	
	@Column(name = "amount")
	private int amount ;  //int�O��l���A��0�AInteger�O����null
	
	@Column(name = "name")
	private String name;
	
	public Bank() {
		
	}
	
    public Bank(String account, int amount) {
    	this.account = account;
    	this.amount = amount;
	}
	
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
