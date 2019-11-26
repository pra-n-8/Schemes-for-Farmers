package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.lti.model.Admin;
import com.lti.model.Bidder;
import com.lti.service.AdminService;


@Controller
public class AdminController{
	@Autowired
	AdminService adminservice;

	@RequestMapping(path="adminLogin.lti",method=RequestMethod.POST)
    public String addNew(@RequestParam(name = "username") String username,@RequestParam(name = "pass") String password)  
    {  
		Admin admin;
		
		try {
		admin=adminservice.loginCheck(username, password);
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		//session code
		
		
        return "home.jsp";  
    }
	
}
