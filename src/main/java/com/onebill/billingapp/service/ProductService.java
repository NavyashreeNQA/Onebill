package com.onebill.billingapp.service;

import com.onebill.billingapp.entities.Services;

public interface ProductService {
	
	public Services addService(Services service);
	
	public Services deleteService(int serviceId);
	
	public Services getService(int serviceId);
	
	public Services updateService(Services service);
}
