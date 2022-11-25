package com.example.demo_project.service.ifs;

import java.util.List;

import com.example.demo_project.entity.Menuu;
import com.example.demo_project.vo.Menu1Res;
import com.example.demo_project.vo.MenuuReq;
import com.example.demo_project.vo.MenuuRes;

public interface OrderrService {
	
	public Menuu createName(String name, int price);  //�Ыث~��
	
	public List<Menuu> getMenus();  //���o�Ҧ��~���B����
	
    public Menu1Res getMenu(String name);  //���o��@�~���B����
    
    public MenuuRes order(List<MenuuReq> orderList);  //�I�\

}
