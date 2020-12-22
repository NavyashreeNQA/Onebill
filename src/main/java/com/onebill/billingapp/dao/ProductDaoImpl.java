package com.onebill.billingapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import com.onebill.billingapp.entities.Services;

@Repository
public class ProductDaoImpl implements ProductDao {

	@PersistenceUnit
	EntityManagerFactory factory;

	@Transactional
	public Services addService(Services service) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(service);
		manager.getTransaction().commit();

		return service;
	}

	public Services deleteService(int serviceId) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Services service = manager.find(Services.class, serviceId);
		manager.remove(service);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		return service;
	}

//	public Company addCompany(Company company) {
//		EntityManager manager = factory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		transaction.begin();
//		manager.persist(company);
//		manager.getTransaction().commit();
//		manager.close();
//		return company;
//
//	}

	public Services getService(int serviceId) {
		EntityManager manager = factory.createEntityManager();
		Services query = manager.find(Services.class, serviceId);
		return query;

	}

	
	public Services updateService(Services service) {
		EntityManager manager = factory.createEntityManager();
		Services details1 = manager.find(Services.class, service.getServiceId());

		if (details1 != null) {
			BeanUtils.copyProperties(service, details1);
			manager.getTransaction().begin();
			manager.close();
			return details1;
		} else {
			manager.close();
			return null;
		}

	}

}
