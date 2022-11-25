package com.example.demo_project.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DepositReq {  //請求
	
	@JsonProperty("account")
	private String account;
	
	@JsonProperty("deposit")
	private int depositAmount;  //參數名可隨意制定(僅在Java裡使用)
	
	public DepositReq() {
		
	}
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(int depositAmount) {
		this.depositAmount = depositAmount;
	}
	
	
}
