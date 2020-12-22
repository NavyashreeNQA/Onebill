package com.onebill.billingapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onebill.billingapp.dao.PlanDao;
import com.onebill.billingapp.entities.Plan;
import com.onebill.billingapp.exception.BillingAppException;
@Service
public class PlanImpl implements PlanService{
	@Autowired
	PlanDao planDao;
	
	public Plan addPlan(Plan plan) {
		Plan addPlan=planDao.addPlan(plan);
		if(addPlan!=null) {
			return addPlan;
		} else {
			throw new BillingAppException("Unable to add plan");
		}
	}
	
	
	public Plan updatePlan(Plan plan) {
		Plan updatePlan=planDao.updatePlan(plan);
		if(updatePlan!=null) {
			return updatePlan;
		} else {
			throw new BillingAppException("Unable to update plan");
		}
	}
	
	
	public List<Plan> getAllPlan() {
		List<Plan> getAllPlan = planDao.getAllPlan();
		if(getAllPlan!=null) {
			return getAllPlan;
		} else {
			throw new BillingAppException("Unable to fetch all plans");
		}
	}
	
	
	public Plan removePlan(int planId) {
		Plan removePlan=planDao.removePlan(planId);
		if(removePlan!=null) {
			return removePlan;
		} else {
			throw new BillingAppException("Unable to remove plan");
		}
	}
	
	public Plan getPlan(int planId) {
		Plan getPlan = planDao.getPlan(planId);
		if(getPlan!=null) {
			return getPlan;
		} else {
			throw new BillingAppException("Unable to fetch a plan");
		}
	}
	
}
