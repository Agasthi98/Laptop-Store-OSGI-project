package com.laptopstore;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class LaptopActivator implements BundleActivator {

	
	ServiceRegistration publishServiceRegistration;


	public void start(BundleContext context) throws Exception {
		LaptopStorePublish publisherService = new LaptopStorePublishImpl();
		publishServiceRegistration = context.registerService(LaptopStorePublish.class.getName(), publisherService,null);
		System.out.println("Start Laptop Store Service");
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Publisher Stop");
		publishServiceRegistration.unregister();
		System.out.println("Stop Store Service");
	}

}
