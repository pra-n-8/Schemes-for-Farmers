package com.lti.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.interfaces.AdminServiceInterface;
import com.lti.interfaces.RegistrationLoginInterface;
import com.lti.model.Admin;
import com.lti.model.Bidder;


@Controller
public class AdminController{

	@RequestMapping(path="adminLogin.lti",method=RequestMethod.POST)
    public String addNew(@RequestParam(name = "username") String username,@RequestParam(name = "pass") String password)  
    {  
		Admin admin;
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		AdminServiceInterface si = (AdminServiceInterface) ctx.getBean("adminservice");
		try {
		admin=si.loginCheck(username, password);
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		//session code
		
		
        return "home.jsp";  
    }
	
}
