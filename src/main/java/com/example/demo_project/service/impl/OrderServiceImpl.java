package com.example.demo_project.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Menu;
import com.example.demo_project.service.ifs.OrderService;
import com.example.demo_project.vo.Order;

@Service
public class OrderServiceImpl implements OrderService {

	private Menu beef = new Menu("beef", 100);
	private Menu pork = new Menu("pork", 90);
	private Menu chicken = new Menu("chicken", 80);

	@Override
	public List<Menu> getMenu() {
		List<Menu> list = new ArrayList<>();
		list.add(beef);
		list.add(pork);
		list.add(chicken);
		return list;
	}
	
// public List<Menu> getMenus() {	
//	//init       制定資料庫的概念
//	Menu beefMenu = new Menu("beef", 100);  
//	Menu porkMenu = new Menu("pork", 90);
//	Menu fishMenu = new Menu("fish", 120);
//	//======================
//	List<Menu> list = new ArrayList<>();   
//  在資料庫中撈取資料(found all menus by DB)
//	list.add(beefMenu);    
//	list.add(porkMenu);
//	list.add(fishMenu);
//	==================
//	return list;
//}

	@Override
	public Order orderMenu() {
		List<Menu> list = new ArrayList<>();
		beef.setNumber(5);
		pork.setNumber(4);
		chicken.setNumber(3);
		list.add(beef);
		list.add(pork);
		list.add(chicken);

		int totalprice = 0;
		for (Menu item : list) {
			int price = item.getPrice();
			int number = item.getNumber();
			totalprice = totalprice + (price * number);
//			totalprice += item.getPrice() * item.getNumber();
		}
//		Order result = new Order();
//		result.setMenuList(menuList);
//		result.setTotalprice(totalprice);
		Order result = new Order(list, totalprice);
		return result;
	}
	
	
	public Menu getMenu(String name) {
//	init       制定資料庫的概念
	Menu beefMenu = new Menu("beef", 100);  
	Menu porkMenu = new Menu("pork", 90);
	Menu fishMenu = new Menu("fish", 120);
//	======================	
	//found menu by name
	if(name.equalsIgnoreCase(beefMenu.getName())) {
		return beefMenu;
	}else if(name.equalsIgnoreCase(porkMenu.getName())) {
		return porkMenu;
	}else if(name.equalsIgnoreCase(fishMenu.getName())) {
		return fishMenu;
	}else {
		return new Menu();
	}
	//found menu by name from DB
  }
	
	
}
