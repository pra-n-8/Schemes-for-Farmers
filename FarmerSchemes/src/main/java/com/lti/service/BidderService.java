package com.lti.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.lti.interfaces.GenericInterface;
import com.lti.interfaces.RegistrationLoginInterface;
import com.lti.model.Bidder;
import com.lti.model.Farmer;

@Service("bidderservice")
public class BidderService implements RegistrationLoginInterface {

	public Boolean register(Object obj) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		GenericInterface dao1 = (GenericInterface) ctx.getBean("bidderdao");
		dao1.addEntity(obj);
		return true;
	}

	public Object login(String username, String password) {
		Bidder bidder;
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		RegistrationLoginInterface dao1 = (RegistrationLoginInterface) ctx.getBean("bidderdao");
		try {
			bidder = (Bidder) dao1.login(username, password);
		} catch (NullPointerException e) {
			return null;
		}
		return bidder;
	}

}
