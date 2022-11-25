package com.example.demo_project.vo;

import com.example.demo_project.entity.Bank;
import com.fasterxml.jackson.annotation.JsonInclude;

public class BankRes { // ����@JsonProperty�A�ushow�X�� //��ƥ洫�榡�A����

//	@JsonInclude(JsonInclude.Include.NON_NULL)
//	private String account;
//	
//	
//	private int amount;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Bank bank;

	private String message;

	public BankRes() {

	}

	public BankRes(Bank bank, String message) {
		this.bank = bank;
		this.message = message;
	}

//   	public String getAccount() {
//		return account;
//	}
//
//	public void setAccount(String account) {
//		this.account = account;
//	}
//
//	public int getAmount() {
//		return amount;
//	}
//
//	public void setAmount(int amount) {
//		this.amount = amount;
//	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
