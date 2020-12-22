package com.onebill.billingapp.dao;

import com.onebill.billingapp.entities.Services;



public interface ProductDao {
//	public Company addCompany(Company company);

	public Services addService(Services service);

	public Services deleteService(int serviceId);
	
	public Services getService(int serviceId);
	
	public Services updateService(Services service);

	
}
