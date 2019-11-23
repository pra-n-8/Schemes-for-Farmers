package com.lti.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.lti.controller.AdminController;
import com.lti.interfaces.AdminServiceInterface;
import com.lti.interfaces.GenericInterface;
import com.lti.model.Admin;
import com.lti.model.Bidder;

@Service("adminservice")
public class AdminService implements AdminServiceInterface{

	public Admin loginCheck(String username, String password) {
		Admin admin;
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		AdminServiceInterface dao1 = (AdminServiceInterface) ctx.getBean("admindao");
		try {
			admin =dao1.loginCheck(username, password);
		} catch (NullPointerException e) {
			return null;
		}
		return admin;
	}

	

}