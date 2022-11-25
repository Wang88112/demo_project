package com.example.demo_project.service.ifs;

import java.util.List;

import com.example.demo_project.entity.Menuu;
import com.example.demo_project.vo.Menu1Res;
import com.example.demo_project.vo.MenuuReq;
import com.example.demo_project.vo.MenuuRes;

public interface OrderrService {
	
	public Menuu createName(String name, int price);  //創建品項
	
	public List<Menuu> getMenus();  //取得所有品項、價格
	
    public Menu1Res getMenu(String name);  //取得單一品項、價格
    
    public MenuuRes order(List<MenuuReq> orderList);  //點餐

}
