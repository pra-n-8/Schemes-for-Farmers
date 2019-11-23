package com.lti.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.lti.interfaces.GenericInterface;
import com.lti.interfaces.RegistrationLoginInterface;
import com.lti.model.Farmer;

@Service("farmerService")
public class FarmerService implements RegistrationLoginInterface {
	@PersistenceContext
	private EntityManager em;

	public Boolean register(Object obj) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		GenericInterface dao1 = (GenericInterface) ctx.getBean("farmerdao");
		dao1.addEntity(obj);
		return true;
	}

	public Object login(String username, String password) {
		Farmer farmer;
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		RegistrationLoginInterface dao1 = (RegistrationLoginInterface) ctx.getBean("farmerdao");
		try {
		farmer = (Farmer) dao1.login(username, password);
		}
		catch(NullPointerException e)
		{
			return null;
		}
		return farmer;
	}

}
