package com.lti.controller;

import javax.servlet.http.HttpSession;

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
	public String Registration(Farmer farmer) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		RegistrationLoginInterface si = (RegistrationLoginInterface) ctx.getBean("farmerService");
		Boolean falg=si.register(farmer);
		return "home.jsp";
	}

	@RequestMapping(path = "farmerlogin.lti", method = RequestMethod.POST)
	public String loginFarmer(@RequestParam(name = "username") String username,@RequestParam(name = "pass") String password,HttpSession session) {
		Farmer farmer;
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		RegistrationLoginInterface si = (RegistrationLoginInterface) ctx.getBean("farmerService");
		try {
		farmer=(Farmer)si.login(username,password);
		session.setAttribute("fname", farmer.getFarmerName());
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		//session code
		
		return "home.jsp";
	}
}