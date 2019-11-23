package com.lti.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.interfaces.RegistrationLoginInterface;
import com.lti.model.Bidder;
import com.lti.model.Farmer;

@Controller
public class BidderController {

	@RequestMapping(path = "bidderRegistration.lti", method = RequestMethod.POST)
	public String display(Bidder bidder) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		RegistrationLoginInterface bi = (RegistrationLoginInterface)ctx.getBean("bidderservice");
		System.out.println(bi.register(bidder));
		return "home.jsp";
	}
	@RequestMapping(path="bidderlogin.lti", method = RequestMethod.POST)
	public String loginBidder(@RequestParam(name="username") String username,@RequestParam(name="pass") String password) {
		Bidder bidder;
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		RegistrationLoginInterface si = (RegistrationLoginInterface) ctx.getBean("bidderservice");
		try {
		bidder=(Bidder)si.login(username,password);
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		//session code
		
		return "home.jsp";
	}
}
