package com.lti.interfaces;

import com.lti.model.Farmer;

public interface FarmerServiceInterface {
	public String addNew(Object obj);

	public Farmer loginCheck(String username, String password);

}