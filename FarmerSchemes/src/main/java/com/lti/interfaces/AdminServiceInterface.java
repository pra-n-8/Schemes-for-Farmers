package com.lti.interfaces;

import com.lti.model.Admin;

public interface AdminServiceInterface {
	public String addNew(Object obj);

	public Admin loginCheck(String username, String password);

}
