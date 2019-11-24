package com.lti.testing;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.dao.InputDao;

import com.lti.model.Admin;
import com.lti.model.Farmer;

public class Testing {

	@Autowired
	InputDao dao;
	
	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		
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

		Farmer farmer = (Farmer)dao.retrieve(81, Farmer.class);
		System.out.println(farmer.getFarmerName());
	}
	
	@Test
	public void addAdmin() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");

		Admin ad = new Admin();
		ad.setAdminUname("admin");
		ad.setAdminPassword("admin");
		dao.addEntity(ad);
	}
	
	@Test
	public void sellCrops() {
		
	}
}
