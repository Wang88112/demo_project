package com.example.demo_project.vo;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddRoleSetReq {
	
	private String account;
	
	@JsonProperty("role_set")
	private Set<String> rolrSet;
	
	public AddRoleSetReq() {
		
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Set<String> getRolrSet() {
		return rolrSet;
	}

	public void setRolrSet(Set<String> rolrSet) {
		this.rolrSet = rolrSet;
	}



	
}
