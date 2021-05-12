package com.laptopPayment;

import java.util.Scanner;

public class LaptopPaymentPublishImpl implements LaptopPaymentPublish{

	@Override
	public boolean displayBuyerList() {
		
		boolean isValid = false;
		
		System.out.println("Enter your bank card number: ");
		
		Scanner sc = new Scanner(System.in);
		String bankCard = sc.next();
		
		while(!isValid) {
					
			if(bankCard.length() == 8) {
				isValid = true;
			}
			else {
				System.out.println("Invalid card number: ");
				bankCard = sc.next();
				isValid = false;
			}
		}
		
		
		if(isValid == true) {
			System.out.println("Card number Validity: " +isValid);
			System.out.println("Payment done by card: " +bankCard);
			System.out.println("Payment Sucessful..");
			System.out.println();
			System.out.println();
		}
		
		return isValid;

	}

}
