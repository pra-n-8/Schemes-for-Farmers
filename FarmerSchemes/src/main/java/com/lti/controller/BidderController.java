package com.lti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.model.Bidder;


@Controller
public class BidderController {

	@RequestMapping(path="register_bidder.lti",method=RequestMethod.POST)
    public String display(Bidder bidder)  
    {  
	System.out.println(bidder);
        return "home.jsp";  
    }     
}
