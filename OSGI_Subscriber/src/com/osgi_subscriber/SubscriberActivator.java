package com.osgi_subscriber;


import com.laptopPayment.LaptopPaymentPublish;
import com.laptopcart.LaptopCartPublisher;
import com.laptopstore.LaptopDetails;
import com.laptopstore.LaptopStorePublish;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class SubscriberActivator implements BundleActivator {
	
	ServiceReference serviceReference1,serviceReference2;
	ServiceReference serviceReferencePayment;

	

	public void start(BundleContext context) throws Exception {
		System.out.println("Start Subscriber Service");
		serviceReference1 = context.getServiceReference(LaptopStorePublish.class.getName());
		LaptopStorePublish laptopStorePublish = (LaptopStorePublish) context.getService(serviceReference1);
		
		while(true) {
			LaptopDetails res = laptopStorePublish.displayStoremenu();
			
			String response = res.getRes();
			
			if(("Y").equalsIgnoreCase(response)) {
				serviceReference2 = context.getServiceReference(LaptopCartPublisher.class.getName());
				LaptopCartPublisher laptopcartPublisher = (LaptopCartPublisher) context.getService(serviceReference2);
				String lapCart = laptopcartPublisher.laptopList(res.getTot());
				
				if(("Y").equalsIgnoreCase(lapCart)) {
					serviceReferencePayment = context.getServiceReference(LaptopPaymentPublish.class.getName());
					LaptopPaymentPublish laptopPayment = (LaptopPaymentPublish) context.getService(serviceReferencePayment);
					boolean isValid = laptopPayment.displayBuyerList();
					
				}
			}
			
			System.out.println("Do you want to quit? (Y/N)");
			Scanner sc1 = new Scanner(System.in);
			String exit = sc1.next();
			
			if(exit.equalsIgnoreCase("N")){
				System.out.println("---------------Welcome Back!-----------------------");
			}else {
				System.out.println();
				System.out.println("Thank you for purchasing from us....");
				System.out.println("Good Bye !!!  ");
				System.out.println("Come again....");
				System.exit(0);
			}
			
		}
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Stop Subscriber");
		context.ungetService(serviceReference1);
	}

}
