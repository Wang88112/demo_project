package com.example.demo_project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  //宣告為實體，給SpringBoot知道
@Table(name = "bank")  //連結在DB的哪張表
public class Bank {        //Bank的entity欄位沒有message
	
	@Id //主鍵
	@Column(name = "account")  //Column是DB欄位名稱
	private String account ;
	
	@Column(name = "amount")
	private int amount ;  //int是原始型態為0，Integer是物件為null
	
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
