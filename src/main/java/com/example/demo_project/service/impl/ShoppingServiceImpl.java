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
			System.out.println("查詢名稱列表不得為空!");
			return; // 如果是空，跳出if停止執行
		}
		Map<String, Product> qeuryMap = new HashMap<>();
		for (String nameItem : querynameList) { // 輸入品項名
			for (Product productItem : productList) { // 商品清單 //==用於數字，字串內容比較用equals
				if (nameItem.equalsIgnoreCase(productItem.getName())) { // equalsIgnoreCase忽略大小寫 //equals
					qeuryMap.put(nameItem, productItem);
					break;
//					System.out.println("品名 : " + productItem.getName() + "，價格 : " + productItem.getPrice()
//					+ "，庫存數量為 : " + productItem.getStorage());
//					return;
				} else {
					qeuryMap.put(nameItem, null);
//					System.out.println("查詢無結果!");

				}

			}

		}
		for (Entry<String, Product> mapItem : qeuryMap.entrySet()) {
			if (mapItem.getValue() == null) {
				System.out.println(mapItem.getKey() + "查詢無結果!");
			} else {
				Product product = mapItem.getValue();
				System.out.println(
						"品項:" + product.getName() + "，價格:" + product.getPrice() + 
						"，庫存數量為:" + product.getStorage());
			}
		}
	}

	@Override
	public void checkout(List<Product> productList) {
		int total = 0;
		for(Product item : productList) {
			if(item.getStorage() < item.getQuantity()){
				System.out.println(item.getName() + "庫存不足，無法購買!");
			}else{
			System.out.println("品項：" + item.getName() + "，價格：" + item.getPrice() + 
					"，購買數量：" + item.getQuantity() + "，金額：" + item.getPrice() * item.getQuantity());
			total += item.getPrice() * item.getQuantity() ;
		    }		
		}
		System.out.println("總金額為：" + total);
	}

}
