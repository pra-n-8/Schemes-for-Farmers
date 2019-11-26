package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import com.lti.model.Admin;
import com.lti.model.CropDetails;

@Service("adminservice")
public class AdminService{

	@Autowired
	AdminService dao1;
	public Admin loginCheck(String username, String password) {
		Admin admin;
		try {
			admin =dao1.loginCheck(username, password);
		} catch (NullPointerException e) {
			return null;
		}
		return admin;
	}

	public List<CropDetails> fetchCropDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	

}