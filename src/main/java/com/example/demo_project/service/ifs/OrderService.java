package com.example.demo_project.service.ifs;

import java.util.List;

import com.example.demo_project.entity.Menu;
import com.example.demo_project.vo.Order;

public interface OrderService { // ��k

	public List<Menu> getMenu();

	public Order orderMenu(); // ���oMenu�̭����~�� ���� �ƶq
	
//  public Menu getMenus();  //���oMenus��"�Ҧ�"���~���B����(get all menu)�A�]���n�Ҧ��A��List<Menu>
//	�ܦ���10��
	
    public Menu getMenu(String name);   //�ھڿ�J�ȧ��۹������F��(get menu by name)

}
