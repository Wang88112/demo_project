package com.example.demo_project.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Product;
import com.example.demo_project.service.ifs.ShoppingService;

@Service
public class ShoppingServiceImpl implements ShoppingService {

	@Override
	public void queryProducts(List<String> querynameList, List<Product> productList) {
		// TODO Auto-generated method stub
		if (querynameList.isEmpty()) {
			System.out.println("�d�ߦW�٦C���o����!");
			return; // �p�G�O�šA���Xif�������
		}
		Map<String, Product> qeuryMap = new HashMap<>();
		for (String nameItem : querynameList) { // ��J�~���W
			for (Product productItem : productList) { // �ӫ~�M�� //==�Ω�Ʀr�A�r�ꤺ�e�����equals
				if (nameItem.equalsIgnoreCase(productItem.getName())) { // equalsIgnoreCase�����j�p�g //equals
					qeuryMap.put(nameItem, productItem);
					break;
//					System.out.println("�~�W : " + productItem.getName() + "�A���� : " + productItem.getPrice()
//					+ "�A�w�s�ƶq�� : " + productItem.getStorage());
//					return;
				} else {
					qeuryMap.put(nameItem, null);
//					System.out.println("�d�ߵL���G!");

				}

			}

		}
		for (Entry<String, Product> mapItem : qeuryMap.entrySet()) {
			if (mapItem.getValue() == null) {
				System.out.println(mapItem.getKey() + "�d�ߵL���G!");
			} else {
				Product product = mapItem.getValue();
				System.out.println(
						"�~��:" + product.getName() + "�A����:" + product.getPrice() + 
						"�A�w�s�ƶq��:" + product.getStorage());
			}
		}
	}

	@Override
	public void checkout(List<Product> productList) {
		int total = 0;
		for(Product item : productList) {
			if(item.getStorage() < item.getQuantity()){
				System.out.println(item.getName() + "�w�s�����A�L�k�ʶR!");
			}else{
			System.out.println("�~���G" + item.getName() + "�A����G" + item.getPrice() + 
					"�A�ʶR�ƶq�G" + item.getQuantity() + "�A���B�G" + item.getPrice() * item.getQuantity());
			total += item.getPrice() * item.getQuantity() ;
		    }		
		}
		System.out.println("�`���B���G" + total);
	}

}
