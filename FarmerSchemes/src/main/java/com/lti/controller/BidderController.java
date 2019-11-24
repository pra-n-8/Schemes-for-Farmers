package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.model.Bidder;
import com.lti.model.Farmer;
import com.lti.service.BidderService;

@Controller
public class BidderController {
	@Autowired
	BidderService bidderservice;

	@RequestMapping(path = "bidderRegistration.lti", method = RequestMethod.POST)
	public String display(Bidder bidder) {
		
		System.out.println(bidderservice.register(bidder));
		return "home.jsp";
	}
	@RequestMapping(path="bidderlogin.lti", method = RequestMethod.POST)
	public String loginBidder(@RequestParam(name="username") String username,@RequestParam(name="pass") String password) {
		Bidder bidder;
		
		try {
		bidder=(Bidder)bidderservice.login(username,password);
		
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		//session code
		
		return "home.jsp";
	}
}
