package com.onebill.billingapp.dao;

import com.onebill.billingapp.entities.Charges;

public interface ChargesDao {
	public Charges addCharges(Charges charges);

	public Charges updateCharges(Charges charges);
	
	public Charges getCharge(int chargeId);
	
	public Charges deleteCharge(int chargeId);

}
