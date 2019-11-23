package com.lti.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.interfaces.RegistrationLoginInterface;
import com.lti.model.Farmer;

@Controller
public class FarmerController {

	@RequestMapping(path = "farmerRegistration.lti", method = RequestMethod.POST)
	public String display(Farmer farmer) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		RegistrationLoginInterface si = (RegistrationLoginInterface) ctx.getBean("farmerService");
		System.out.println(si.register(farmer));
		return "home.jsp";
	}

	@RequestMapping(path = "farmerlogin.lti", method = RequestMethod.POST)
	public String loginFarmer(@RequestParam(name = "username") String username,@RequestParam(name = "pass") String password) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		RegistrationLoginInterface si = (RegistrationLoginInterface) ctx.getBean("farmerService");
		Farmer farmer=(Farmer)si.login(username,password);
		if(farmer!=null) {
			System.out.println("Success"+ farmer.getFarmerName());
		}
		else {
			System.out.println("Failed" + farmer.getFarmerName());
		}
		
		return "home.jsp";
	}
}