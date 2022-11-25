package com.example.demo_project.entity;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int count = 1; // 限制次數
		int x, y; // 輸入的數字(2個)
		String a, b, c; // a=輸入運算式，b=運算符號，c=YesNo
		int total = 0;
		System.out.println("計算機");

		while (count <= 3) {
			System.out.println("第" + count + "次執行，限制3次!");
			System.out.println("ADD  Minus  Mulit  Division  Mod");
			System.out.println("請輸入想執行之運算方式 : ");
			Scanner sc = new Scanner(System.in);
			a = sc.next();
			// 判斷是否為設定之運算字
			if (a.equalsIgnoreCase("ADD")) {
				b = "+";
			} else if (a.equalsIgnoreCase("Minus")) {
				b = "-";
			} else if (a.equalsIgnoreCase("Mulit")) {
				b = "*";
			} else if (a.equalsIgnoreCase("Division")) {
				b = "/";
			} else if (a.equalsIgnoreCase("Mod")) {
				b = "%";
			} else {
				System.out.println("請輸入正確運算方式，結束計算機!");
				count++;
				continue;
			}

			System.out.println("請輸入數字2個數字 : (只能是1到50)");
			try {
				x = sc.nextInt();
				y = sc.nextInt();
			} catch (Exception e) {
				System.out.println("請輸入數字，終止計算機!");
				count++;
				continue;
			}

			// 限制值1-50
			if ((x < 1 || x > 50) || (y < 1 || y > 50)) {
				System.out.println("輸入錯誤，請輸入範圍內的數字，終止計算機!");
				count++;
				continue;
			}

			System.out.println("算式是否為 : " + x + " " + b + " " + y + "，是：請輸入 Y ,否；請輸入 N : ");
			c = sc.next();

			if (c.equalsIgnoreCase("Y")) {
				System.out.println(c + " : 輸入正確，執行計算。");
				switch (b) {
				case "+":
					total = x + y;
					System.out.printf("相加為 : %d + %d = %d", x, y, total);
					break;
				case "-":
					total = x - y;
					System.out.printf("相減為 : %d - %d = %d", x, y, total);
					break;
				case "*":
					total = x * y;
					System.out.printf("相乘為 : %d * %d = %d", x, y, total);
					break;
				case "/":
					double x1 = x;
					double y1 = y;
					double total1 = (x1 / y1);
					System.out.printf(x + "/" + y + "=" + total1);
					break;
				case "%":
					int total2 = (x % y);
					System.out.printf(x + "/" + y + "餘數為:" + total2);
					break;
				}
			} else if (b.equalsIgnoreCase("N")) {
				System.out.println(c + " : 輸入錯誤，終止計算。");
				count++;
				continue;
			} else {
				System.out.println("輸入錯誤，請輸入 Y 或 N。");
				count++;
				continue;
			}
			break;

		}
	}
}
