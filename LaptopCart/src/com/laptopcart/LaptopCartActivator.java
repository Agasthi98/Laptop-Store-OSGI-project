package com.laptopcart;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class LaptopCartActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext context) throws Exception {
		LaptopCartPublisher laptopCartPublisher = new LaptopCartmpl();
		publishServiceRegistration = context.registerService(LaptopCartPublisher.class.getName(), laptopCartPublisher,null);
		System.out.println("Start Cart Service");
	}

	public void stop(BundleContext context) throws Exception {
		publishServiceRegistration.unregister();
		System.out.println("Stop Cart Service");
	}

}
