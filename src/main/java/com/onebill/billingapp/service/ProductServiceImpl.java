package com.onebill.billingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onebill.billingapp.dao.ProductDao;
import com.onebill.billingapp.entities.Services;
import com.onebill.billingapp.exception.BillingAppException;

@Service

public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDao productDao;

	public Services addService(Services service) {
		Services addService = productDao.addService(service);
		if(addService!=null) {
			return addService;
		} else {
			throw new BillingAppException("Unable to add service");
		} 
	}
	
	
	public Services deleteService(int serviceId) {
		Services deleteService=productDao.deleteService(serviceId);
		if(deleteService!=null) {
			return deleteService;
		} else {
			throw new BillingAppException("Unable to delete service");
		}
	}
	
	

	
	public Services getService(int serviceId) {
		Services getService =productDao.getService(serviceId);
		if(getService!=null) {
			return getService;
		} else {
			throw new BillingAppException("Unable to fetch a service");
		}

	}


	public Services updateService(Services service) {
		Services getService =productDao.updateService(service);
		if(getService!=null) {
			return getService;
		} else {
			throw new BillingAppException("Unable to update a service");
		}

	}

}
