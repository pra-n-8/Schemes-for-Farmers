package com.lti.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.lti.interfaces.GenericInterface;

@Service("adminService")
public class AdminService {

	public String addNew(Object obj) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		GenericInterface dao1 = (GenericInterface) ctx.getBean("genericDao");
		dao1.addEntity(obj);
		return "Success";
	}

	public void showBids() {
		// TODO Auto-generated method stub

	}

	public void loginCheck() {
		// TODO Auto-generated method stub

	}
	
	public void display() {
		// TODO Auto-generated method stub

	}


}