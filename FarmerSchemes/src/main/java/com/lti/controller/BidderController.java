package com.lti.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Bidder;
import com.lti.model.CurrentBid;
import com.lti.model.ListedCrops;
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
	public String loginBidder(@RequestParam(name="username") String username,@RequestParam(name="pass") String password,HttpSession session) {
		Bidder bidder;
		
		try {
		bidder=(Bidder)bidderservice.login(username,password);

		session.setAttribute("Bidder", bidder);
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		
//		session.setAttribute("bidder", bidder);
		return "ViewMarketplaceBidder.jsp";
	}
	@RequestMapping(path="viewcrops.lti" , method = RequestMethod.POST)
	public ModelAndView viewlistedCrops(HttpSession session) {
		System.out.println("in view");
		ModelAndView mnv = new ModelAndView("ViewMarketplaceBidder.jsp");
		List<ListedCrops> li = bidderservice.viewCrops();
		System.out.println(li.size());
		mnv.addObject("list", li);
		return mnv;
	}
	
	@RequestMapping(path="viewcrops1.lti" , method = RequestMethod.POST)
	public ModelAndView viewlistedCrops1(HttpSession session) {
		System.out.println("in view");
		ModelAndView mnv = new ModelAndView("ViewMarketplaceBidder.jsp");
		List<CurrentBid> li = bidderservice.viewCrops1();
		System.out.println(li.size());
		mnv.addObject("list", li);
		return mnv;
	}
	
}
