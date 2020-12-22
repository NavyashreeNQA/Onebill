package com.onebill.billingapp.service;

import com.onebill.billingapp.entities.Charges;

public interface ChargesService {
	public Charges addCharges(Charges charges);
	
	public Charges getCharge(int chargeId);
	
	public Charges updateCharges(Charges charges);
	
	public Charges deleteCharge(int chargeId);

}
