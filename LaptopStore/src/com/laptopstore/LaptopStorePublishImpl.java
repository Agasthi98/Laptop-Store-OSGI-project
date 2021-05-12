package com.laptopstore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LaptopStorePublishImpl implements LaptopStorePublish{

	@Override
	public LaptopDetails displayStoremenu() {
		
		
		System.out.println("---------------------------------------------------");
		System.out.println("-----------Welcome to CyberZone--------------------");
		System.out.println("---------------Laptop List-------------------------");
		System.out.println();
		System.out.println("--1-- ASUS Zenbook Flip 13 UX363 i7");
		System.out.println("--2-- ASUS ZenBook Pro Duo UX581LV i7 10th GEN with RTX 2060");
		System.out.println("--3-- ASUS TUF Gaming A15 Ryzen 7 4th GEN with GTX1650Ti");
		System.out.println("--4-- MSI GE76 RAIDER RTX 3070");
		System.out.println("--5-- MSI GP66 LEOPARD RTX 3060");
		System.out.println("--6-- MSI GF63 Thin 9SCX i5 with GTX 1650");
		System.out.println("--7-- ACER PREDATOR TRITON 300 i7 - RTX 2060");
		System.out.println("--8-- ACER NITRO 5 GAMING i5-10th GEN GTX 1650");
		System.out.println("--9-- ACER PREDATOR TRITON 300 i7 - RTX 2070");
		System.out.println("--10--HP 15S AMD Athlon Silver 3050U");
		System.out.println("---------------------------------------------------");
		System.out.println("---------------------------------------------------");
		System.out.println();
		
		String resp;
		int sum = 0;
		
		do {
			System.out.println("Enter the laptop code: ");
			Scanner sc = new Scanner(System.in);
			int code = sc.nextInt();
			
			System.out.println("Enter the quantity: ");
			Scanner sc1 = new Scanner(System.in);
			int quan = sc1.nextInt();
			
			
			HashMap laptops = new HashMap();
			laptops.put(1,335000);
			laptops.put(2,695000);
			laptops.put(3,245000);
			laptops.put(4,159000);
			laptops.put(5,212000);
			laptops.put(6,185000);
			laptops.put(7,120000);
			laptops.put(8,450000);
			laptops.put(9,234000);
			laptops.put(10,75000);
			
			
			
//			ArrayList<Integer> laptops = new ArrayList<Integer>();
//			laptops.put(335000);
//			laptops.put(695000);
//			laptops.put(245000);
//			laptops.put(159000);
//			laptops.put(212000);
//			laptops.put(185000);
//			laptops.put(120000);
//			laptops.put(450000);
//			laptops.put(234000);
//			laptops.put(75000);
			
			
			if(code == 1) {
				sum = sum + (quan * (Integer)laptops.get(1));
				System.out.println("laptop Price :"+ laptops.get(1));
			}
			else if(code == 2) {
				sum = sum + (quan * (Integer)laptops.get(2));
				System.out.println("laptop Price :"+ laptops.get(2));
			}
			else if(code == 3) {
				sum = sum + (quan * (Integer)laptops.get(3));
				System.out.println("laptop Price :"+ laptops.get(3));
			}
			else if(code == 4) {
				sum = sum + (quan * (Integer)laptops.get(4));
				System.out.println("laptop Price :"+ laptops.get(4));
			}
			else if(code == 5) {
				sum = sum + (quan * (Integer)laptops.get(5));
				System.out.println("laptop Price :"+ laptops.get(5));
			}
			else if(code == 6) {
				sum = sum + (quan * (Integer)laptops.get(6));
				System.out.println("laptop Price :"+ laptops.get(6));
			}
			else if(code == 7) {
				sum = sum + (quan * (Integer)laptops.get(7));
				System.out.println("laptop Price :"+ laptops.get(7));
			}
			else if(code == 8) {
				sum = sum + (Integer)laptops.get(8);
				System.out.println("laptop Price :"+ laptops.get(8));
			}
			else if(code == 9) {
				sum = sum + (Integer)laptops.get(9);
				System.out.println("laptop Price :"+ laptops.get(9));
			}
			else if(code == 10) {
				sum = sum + (Integer)laptops.get(10);
				System.out.println("laptop Price :"+ laptops.get(10));
			}
			else {
				System.out.println("Invalid code. Please enter valid code");
		
			}
		
		System.out.println("Do you want to add to cart ? (Y/N): ");
		Scanner scanner = new Scanner(System.in);
		resp = scanner.next();
		
		}while(resp.equalsIgnoreCase("N"));
		

		return new LaptopDetails(sum, resp);
		
		
	}
	
}
