package com.example.demo_project.vo;


public class DepositRes {
    
	private String account;
	
	private int amount;
	
	private String message;
	
	
	public DepositRes() {
		
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
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
	
	
}
