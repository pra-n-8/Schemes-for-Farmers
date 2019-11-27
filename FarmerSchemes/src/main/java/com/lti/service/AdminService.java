package com.lti.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.lti.dao.AdminDao;
import com.lti.model.Admin;
import com.lti.model.CropDetails;
import com.lti.model.ListedCrops;

@Service("adminservice")
public class AdminService{

	@Autowired
	AdminDao dao1;
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

	public List<ListedCrops> viewrequests(){
		return dao1.retrieve(LocalDateTime.now());
	}

}