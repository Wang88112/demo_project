package com.example.demo_project.entity;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int count = 1; // �����
		int x, y; // ��J���Ʀr(2��)
		String a, b, c; // a=��J�B�⦡�Ab=�B��Ÿ��Ac=YesNo
		int total = 0;
		System.out.println("�p���");

		while (count <= 3) {
			System.out.println("��" + count + "������A����3��!");
			System.out.println("ADD  Minus  Mulit  Division  Mod");
			System.out.println("�п�J�Q���椧�B��覡 : ");
			Scanner sc = new Scanner(System.in);
			a = sc.next();
			// �P�_�O�_���]�w���B��r
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
				System.out.println("�п�J���T�B��覡�A�����p���!");
				count++;
				continue;
			}

			System.out.println("�п�J�Ʀr2�ӼƦr : (�u��O1��50)");
			try {
				x = sc.nextInt();
				y = sc.nextInt();
			} catch (Exception e) {
				System.out.println("�п�J�Ʀr�A�פ�p���!");
				count++;
				continue;
			}

			// �����1-50
			if ((x < 1 || x > 50) || (y < 1 || y > 50)) {
				System.out.println("��J���~�A�п�J�d�򤺪��Ʀr�A�פ�p���!");
				count++;
				continue;
			}

			System.out.println("�⦡�O�_�� : " + x + " " + b + " " + y + "�A�O�G�п�J Y ,�_�F�п�J N : ");
			c = sc.next();

			if (c.equalsIgnoreCase("Y")) {
				System.out.println(c + " : ��J���T�A����p��C");
				switch (b) {
				case "+":
					total = x + y;
					System.out.printf("�ۥ[�� : %d + %d = %d", x, y, total);
					break;
				case "-":
					total = x - y;
					System.out.printf("�۴ : %d - %d = %d", x, y, total);
					break;
				case "*":
					total = x * y;
					System.out.printf("�ۭ��� : %d * %d = %d", x, y, total);
					break;
				case "/":
					double x1 = x;
					double y1 = y;
					double total1 = (x1 / y1);
					System.out.printf(x + "/" + y + "=" + total1);
					break;
				case "%":
					int total2 = (x % y);
					System.out.printf(x + "/" + y + "�l�Ƭ�:" + total2);
					break;
				}
			} else if (b.equalsIgnoreCase("N")) {
				System.out.println(c + " : ��J���~�A�פ�p��C");
				count++;
				continue;
			} else {
				System.out.println("��J���~�A�п�J Y �� N�C");
				count++;
				continue;
			}
			break;

		}
	}
}
