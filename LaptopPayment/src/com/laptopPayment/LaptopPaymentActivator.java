package com.laptopPayment;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class LaptopPaymentActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext context) throws Exception {
		LaptopPaymentPublish paymentServicePublish = new LaptopPaymentPublishImpl();
		publishServiceRegistration = context.registerService(LaptopPaymentPublish.class.getName(), paymentServicePublish, null);
		System.out.println("Start Billing..");
	}

	public void stop(BundleContext context) throws Exception {
		publishServiceRegistration.unregister();
		System.out.println("Stop Billing Service");
	}

}
