package com.example.demo_project.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DepositReq {  //�ШD
	
	@JsonProperty("account")
	private String account;
	
	@JsonProperty("deposit")
	private int depositAmount;  //�ѼƦW�i�H�N��w(�ȦbJava�̨ϥ�)
	
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
