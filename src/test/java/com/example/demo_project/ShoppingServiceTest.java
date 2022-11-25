package com.example.demo_project;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo_project.entity.Product;
import com.example.demo_project.service.ifs.ShoppingService;

@SpringBootTest
public class ShoppingServiceTest {

	@Autowired
	private ShoppingService shoppingService;

	@Test
	public void queryProductTest() {
		// prepare
		Product p1 = new Product("Apple", 25, 50);
		Product p2 = new Product("Banana", 10, 50);
		Product p3 = new Product("Or", 30, 50);

		List<Product> productList = new ArrayList<>();
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);

		List<String> querynameList = new ArrayList<>();
		querynameList.add("Apple");
		querynameList.add("Banana");
		querynameList.add("Or");
		shoppingService.queryProducts(querynameList, productList);
		System.out.println("-----------------");
		p1.setQuantity(0);
		p2.setQuantity(20);
		p3.setQuantity(60);
		shoppingService.checkout(productList);
	}
}
