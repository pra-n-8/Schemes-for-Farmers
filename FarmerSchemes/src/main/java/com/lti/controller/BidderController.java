package com.lti.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.interfaces.RegistrationLoginInterface;
import com.lti.model.Bidder;

@Controller
public class BidderController {

	@RequestMapping(path = "bidderRegistration.lti", method = RequestMethod.POST)
	public String display(Bidder bidder) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		RegistrationLoginInterface bi = (RegistrationLoginInterface)ctx.getBean("bidderservice");
		System.out.println(bi.register(bidder));
		return "home.jsp";
	}
}
