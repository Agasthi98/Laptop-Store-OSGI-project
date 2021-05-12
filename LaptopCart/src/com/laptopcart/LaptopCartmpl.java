package com.laptopcart;

import java.util.Scanner;

public class LaptopCartmpl implements LaptopCartPublisher{

	@Override
	public String laptopList(int sum) {
		
		System.out.println("Total bill : Rs." +sum);
		System.out.print("Do you want to buy? (Y/N): ");
		
		Scanner sc = new Scanner(System.in);
		String res = sc.next();
		
		return res;
	}

}
