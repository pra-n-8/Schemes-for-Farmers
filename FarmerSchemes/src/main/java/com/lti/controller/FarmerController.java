package com.lti.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.CropDetails;
import com.lti.model.Farmer;
import com.lti.service.FarmerService;

@Controller
public class FarmerController {

	@Autowired 
	FarmerService farmerService;
	
	@RequestMapping(path = "farmerRegistration.lti", method = RequestMethod.POST)
	public String Registration(Farmer farmer) {
		Boolean falg=farmerService.register(farmer);
		return "home.jsp";
	}

	@RequestMapping(path = "farmerlogin.lti", method = RequestMethod.POST)
	public String loginFarmer(@RequestParam(name = "username") String username,@RequestParam(name = "pass") String password,HttpSession session) 
	{
		Farmer farmer;
		try {
		farmer=(Farmer)farmerService.login(username,password);
		session.setAttribute("fname", farmer.getFarmerName());
		session.setAttribute("fid", farmer.getFarmerId());
		session.setAttribute("farmer",farmer);
		}
		catch(NullPointerException e){
			return "FarmerRegistration.jsp";
		}
		//session code
		
		return "Sell_Request.jsp";
	}
	
	@RequestMapping(path="placeCrops.lti", method = RequestMethod.POST)
	public ModelAndView holdAuction(HttpSession session) {
		List<CropDetails> searchList = farmerService.getCrops((Farmer)session.getAttribute("farmer"));
		System.out.println( searchList.size());
		ModelAndView mav = new ModelAndView("new");
		mav.addObject("searchList", searchList);
		return mav;
	}
}