package com.example.demo_project.service.ifs;

import java.util.List;

import com.example.demo_project.entity.Menu;
import com.example.demo_project.vo.Order;

public interface OrderService { // 方法

	public List<Menu> getMenu();

	public Order orderMenu(); // 取得Menu裡面的品項 價格 數量
	
//  public Menu getMenus();  //取得Menus裡"所有"的品項、價格(get all menu)，因為要所有，用List<Menu>
//	變成第10行
	
    public Menu getMenu(String name);   //根據輸入值找到相對應的東西(get menu by name)

}
