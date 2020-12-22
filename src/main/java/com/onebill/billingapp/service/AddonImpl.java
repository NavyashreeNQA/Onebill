package com.onebill.billingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onebill.billingapp.dao.AddonDao;
import com.onebill.billingapp.entities.Addon;
import com.onebill.billingapp.exception.BillingAppException;

@Service
public class AddonImpl implements AddonService {
	@Autowired
	private AddonDao addonDao;

	public Addon addAddon(Addon addon) {
		Addon addAddon = addonDao.addAddon(addon);
		if (addAddon != null) {
			return addAddon;
		} else {
			throw new BillingAppException("Unable to add addons");
		}
	}

	public Addon deleteAddon(int addonId) {
		Addon deleteAddon = addonDao.deleteAddon(addonId);
		if (deleteAddon != null) {
			return deleteAddon;
		} else {
			throw new BillingAppException("Unable to delete addons");
		}
	}

	public Addon updateAddon(Addon addon) {
		Addon updateAddon = addonDao.updateAddon(addon);
		if (updateAddon != null) {
			return updateAddon;
		} else {
			throw new BillingAppException("Unable to update addons");
		}
	}

	public Addon getAddons(int userId) {
		Addon getAddon = addonDao.getAddons(userId);
		if (getAddon != null) {
			return getAddon;
		} else {
			throw new BillingAppException("Unable to fetch addons");
		}
	}

}
