package com.lti.interfaces;

import java.util.List;

import com.lti.model.Admin;
import com.lti.model.CropDetails;

public interface AdminServiceInterface {

	public Admin loginCheck(String username, String password);
	
	
	public List<CropDetails> fetchCropDetails();

}
