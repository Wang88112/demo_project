package com.example.demo_project.vo;

import java.util.List;

import com.example.demo_project.entity.Menu;

public class Order {

	private List<Menu> menuList; // 品項價格數量

	private int totalprice;

	public Order() {

	}

	public Order(List<Menu> menuList, int totalprice) {
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
