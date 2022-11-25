package com.example.demo_project.vo;

import java.util.List;

import com.example.demo_project.entity.Menu;
import com.fasterxml.jackson.annotation.JsonInclude;

public class MenuRes { // show¥X¨Ó

	private List<Menu> menuList;  //menuList is null

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Integer totalprice;

	public MenuRes() {

	}

	public MenuRes(List<Menu> menuList) {
		this.menuList = menuList;
	}

	public MenuRes(List<Menu> menuList, int totalprice) {
		this.menuList = menuList;
		this.totalprice = totalprice;
	}

	public List<Menu> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<Menu> menuList) {
		this.menuList = menuList;
	}

	public int getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}

}
