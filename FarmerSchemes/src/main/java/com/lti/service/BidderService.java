package com.lti.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.lti.interfaces.BidderServiceInterface;
import com.lti.interfaces.GenericInterface;
import com.lti.model.Farmer;
@Service("bidderservice")
public class BidderService implements BidderServiceInterface {

	public String addNew(Object obj) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		GenericInterface dao1 = (GenericInterface) ctx.getBean("genericDao");
		dao1.addEntity(obj);
		return "Success";
	}

	public Farmer loginCheck(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
