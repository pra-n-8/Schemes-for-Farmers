package com.lti.testing;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.interfaces.GenericInterface;
import com.lti.model.Admin;
import com.lti.model.Farmer;

public class Testing {

	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		GenericInterface dao = (GenericInterface) ctx.getBean("genericDao");
		Farmer farmer1 = new Farmer();
		farmer1.setFarmerName("medhavi");
		farmer1.setFarmerAddress("Banglore");
		farmer1.setFarmerCity("Banglore");
		farmer1.setFarmerContact(456356);
		farmer1.setFarmerEmail("apoc@dslfjh.com");
		farmer1.setFarmerPanCard("1895sdgf");
		farmer1.setFarmerPassword("bajja");
		farmer1.setFarmerAadharCard(12347567);
		farmer1.setFarmerState("Maharashtra");
		dao.addEntity(farmer1);
	}

	@Test
public void loginTest()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		GenericInterface dao = (GenericInterface) ctx.getBean("genericDao");
		Farmer farmer = (Farmer)dao.retrieve(81, Farmer.class);
		System.out.println(farmer.getFarmerName());
	}
	
	@Test
	public void addAdmin() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		GenericInterface dao = (GenericInterface) ctx.getBean("genericDao");
		Admin ad = new Admin();
		ad.setAdminUname("admin");
		ad.setAdminPassword("admin");
		dao.addEntity(ad);
	}
	
	@Test
	public void sellCrops() {
		
	}
}
