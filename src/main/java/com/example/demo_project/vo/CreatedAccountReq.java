package com.example.demo_project.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreatedAccountReq {
	
	@JsonProperty("createdAccount")
	private String account;
	
	
	
	public CreatedAccountReq() {
		
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	
}
