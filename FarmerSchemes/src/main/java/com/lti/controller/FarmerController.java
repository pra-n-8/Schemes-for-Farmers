package com.lti.controller;

import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.CropDetails;
import com.lti.model.CurrentBid;
import com.lti.model.Farmer;
import com.lti.model.ListedCrops;
import com.lti.service.FarmerService;

@Controller
public class FarmerController {

	@Autowired 
	FarmerService farmerService;

	@RequestMapping(path = "farmerRegistration.lti", method = RequestMethod.POST)
	public String Registration(Farmer farmer) {
		Boolean falg = farmerService.register(farmer);
		return "home.jsp";
	}

	@RequestMapping(path = "farmerlogin.lti", method = RequestMethod.POST)
	public String loginFarmer(@RequestParam(name = "username") String username,
			@RequestParam(name = "pass") String password, HttpSession session) {
		Farmer farmer;
		try {
			farmer = (Farmer) farmerService.login(username, password);
			session.setAttribute("fname", farmer.getFarmerName());
			session.setAttribute("fid", farmer.getFarmerId());
			session.setAttribute("farmer", farmer);
		} catch (NullPointerException e) {
			return "FarmerRegistration.jsp";
		}
		// session code

		return "Sell_Request.jsp";
	}

	@RequestMapping(path = "placeCrops.lti", method = RequestMethod.POST)
	public String holdAuction(CropDetails crop, HttpSession session, @RequestParam(name = "quantity") int qunatity,
			@RequestParam(name = "expiryTime") String expiryTime) {
		crop.setFarmer((Farmer)session.getAttribute("farmer"));
		ListedCrops listedCrops = new ListedCrops();
		listedCrops.setCrop(crop);
		listedCrops.setBasePrice(crop.getRate());
		listedCrops.setFarmer((Farmer)session.getAttribute("farmer"));
		listedCrops.setQuantity(qunatity);
		listedCrops.setExpiryTime(expiryTime);
		listedCrops.setPostTime(LocalDateTime.now());
		farmerService.register(listedCrops);

		return "home.jsp";
	}
	@RequestMapping(path = "goToViewPage.lti", method = RequestMethod.POST)
	public ModelAndView viewCrops(HttpSession session) {
		ModelAndView mnv = new ModelAndView("ViewRequest.jsp");
		List<CropDetails> crops = farmerService.getCrops((Farmer) session.getAttribute("farmer"));
		System.out.println(crops.size());
		Farmer farmer = (Farmer)session.getAttribute("farmer");
		System.out.println(farmer.getFarmerName());
		mnv.addObject("Crops", crops);
		return mnv;
	}
	
	@RequestMapping(path="putOnSale.lti", method = RequestMethod.POST)
	public String putONSale(@RequestParam(name="cropId") int cropId, HttpSession session) {
		farmerService.AuctionCrop(cropId);
		return "home.jsp";
	}
//	List<CropDetails> searchList = farmerService.getCrops((Farmer)session.getAttribute("farmer"));
//	System.out.println( searchList.size());
//	ModelAndView mav = new ModelAndView("");
//	mav.addObject("searchList", searchList);
//	return mav;
}