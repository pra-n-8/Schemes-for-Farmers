package com.lti.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import com.lti.model.Bidder;
import com.lti.model.CurrentBid;
import com.lti.model.ListedCrops;
import com.lti.service.BidderService;

@Controller
@SessionAttributes("bidder")
public class BidderController {
	@Autowired
	BidderService bidderservice;

	@RequestMapping(path = "bidderRegistration.lti", method = RequestMethod.POST)
	public String display(Bidder bidder) {
		
		System.out.println(bidderservice.register(bidder));
		return "home.jsp";
	}
	@RequestMapping(path="bidderlogin.lti", method = RequestMethod.POST)
	public ModelAndView loginBidder(@RequestParam(name="username") String username,@RequestParam(name="pass") String password,HttpSession session) {
		Bidder bidder;
		
		try {
		bidder=(Bidder)bidderservice.login(username,password);
		session.setAttribute("bname", bidder.getBidderName());
		session.setAttribute("bidder", bidder);
		}
		catch(Exception e){
			ModelAndView mnv = new ModelAndView("BidderLogin.jsp");
			mnv.addObject("Error","Invalid username or password");
			return mnv;
		}
//		session.setAttribute("bidder", bidder);
		ModelAndView mnv = new ModelAndView("BidderWelcome.jsp");
		return mnv;
	}
	@RequestMapping(path="viewcrops.lti" , method = RequestMethod.POST)
	public ModelAndView viewlistedCrops(HttpSession session) {
		ModelAndView mnv = new ModelAndView("ViewMarketplaceBidder.jsp");
		List<ListedCrops> li = bidderservice.viewCrops();
		System.out.println(li.size());
		mnv.addObject("list", li);
		mnv.addObject("session",session);
		return mnv;

	}
	
	@RequestMapping(path="bidForcrop.lti" , method = RequestMethod.POST)
	public ModelAndView BidCrop(@RequestParam(name="listingId") int id,@RequestParam(name="Amount") double amount ,HttpSession session) {
		Boolean flag =bidderservice.getAmount(id,amount);
		if(flag==true)
		{
		CurrentBid cb = new CurrentBid();
		cb.setAmount(amount);
		cb.setBidder((Bidder)session.getAttribute("bidder"));
		cb.setCrop(bidderservice.getListedCrop(id));
		bidderservice.register(cb);
		Bidder bidder = (Bidder)session.getAttribute("bidder");
		ListedCrops l = bidderservice.getListedCrop(id);
l.setBasePrice(amount);
bidderservice.register(l);
		ModelAndView mnv = new ModelAndView("ViewMarketplaceBidder.jsp");
		List<ListedCrops> li = bidderservice.viewCrops();
		System.out.println(li.size());
		mnv.addObject("list", li);
		return mnv;
		}
		else
		{
			ModelAndView mnv = new ModelAndView("ViewMarketplaceBidder.jsp");
			List<ListedCrops> li = bidderservice.viewCrops();
			System.out.println(li.size());
			mnv.addObject("list", li);
			mnv.addObject("Error","Place Higher Bid");
			return mnv;
		}
	}
	@RequestMapping(path="logout.lti" , method = RequestMethod.POST)
	public String logout(HttpSession session) {
		session.invalidate();
		return "home.jsp";
	}
	//showPastbids
}
