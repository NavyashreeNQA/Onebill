package com.onebill.billingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onebill.billingapp.dao.ChargesDao;
import com.onebill.billingapp.entities.Charges;
import com.onebill.billingapp.exception.BillingAppException;
@Service
public class ChargesImpl implements ChargesService{
	@Autowired
	ChargesDao companyDao;
	
	public Charges addCharges(Charges charges) {
		Charges addCharges=companyDao.addCharges(charges);
		if(addCharges!=null) {
			return addCharges;
		} else {
			throw new BillingAppException("Unable to add charges");
		}
	}

	
	public Charges updateCharges(Charges charges) {
		Charges updateCharges=companyDao.updateCharges(charges);
		if(updateCharges!=null) {
			return updateCharges;
		} else {
			throw new BillingAppException("Unable to update charge");
		}
	}


	public Charges getCharge(int chargeId) {
		Charges getCharge = companyDao.getCharge(chargeId);
		if(getCharge!=null) {
			return getCharge;
		} else {
			throw new BillingAppException("Unable to fetch a plan");
		}

	}


	public Charges deleteCharge(int chargeId) {
		Charges deleteCharge = companyDao.deleteCharge(chargeId);
		if (deleteCharge != null) {
			return deleteCharge;
		} else {
			throw new BillingAppException("Unable to delete ");
		}
	}

}
