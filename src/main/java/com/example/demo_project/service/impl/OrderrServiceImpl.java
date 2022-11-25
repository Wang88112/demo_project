package com.example.demo_project.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo_project.entity.Menuu;
import com.example.demo_project.repository.MenuDao;
import com.example.demo_project.service.ifs.OrderrService;
import com.example.demo_project.vo.Menu1Res;
import com.example.demo_project.vo.MenuuReq;
import com.example.demo_project.vo.MenuuRes;

@Service
public class OrderrServiceImpl implements OrderrService {

	@Autowired
	public MenuDao menuDao;

	@Override
	public Menuu createName(String name, int price) {

		Menuu menu = new Menuu();
		if (menuDao.existsById(name)) { // �P�_Id�O�_�������
			return null; // ���Ȧ^�Ǫ�
		}
		if(!StringUtils.hasText(name)){
			return null;		
		}
		menu.setName(name);
		menu.setPrice(price);
		return menuDao.save(menu);
	}

	@Override
	public List<Menuu> getMenus() {
		List<Menuu> menuList = new ArrayList<>();
		menuList = menuDao.findAll();
		return menuList;
	}

	@Override
	public Menu1Res getMenu(String name) {
		Optional<Menuu> menuOp = menuDao.findById(name);  //��Optional(�e��)��Menuu�]�_��
		Menu1Res res = new Menu1Res();                    //�̭��u��2�ت��A���ȩεL��(null)
		if (menuOp.isPresent()) {  //�P�_�O�_�s�b
			res.setName(name);    //�]�w�~��
			res.setPrice(menuOp.get().getPrice());  //�qMenuu�̪�menuOp�s�X.get()�A��o��̭����ݩ�
			return res;
		} else {
			res.setMessage("�d�L���~��!");
			return res;
		}

	}

	@Override
	public MenuuRes order(List<MenuuReq> orderList) {
		 int total = 0;
		  Boolean b = true;
		  MenuuRes res = new MenuuRes();
		  List<Menuu> list = menuDao.findAll();

		  for (MenuuReq item1 : orderList) {
		   b = true;
		   if(item1.getNumber() < 0) {
		    item1.setNumber(0);
		   }
		   for (Menuu item2 : list) {

		    if (item1.getName().equalsIgnoreCase(item2.getName())) {
		     total += item2.getPrice() * item1.getNumber();
		     item1.setPrice(item2.getPrice());
		     b = false;
		    }
		   }

		   if (b) {
		    item1.setNumber(0);
		   }

		   
		  }
		  
		  if (total >= 500) {
		   res.setMessage("�W�L500����9��!");
		   total = (int) (total * 0.9);
		  }

		  res.setOrderList(orderList);
		  res.setPrice(total);
		  return res;
}
}
