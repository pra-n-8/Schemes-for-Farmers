package com.lti.controller;

import java.util.List;

import javax.mail.Session;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Admin;
import com.lti.model.Bidder;
import com.lti.model.ListedCrops;
import com.lti.service.AdminService;


@Controller
public class AdminController{
	@Autowired
	AdminService adminservice;

	@RequestMapping(path="adminLogin.lti",method=RequestMethod.POST)
    public ModelAndView addNew(@RequestParam(name = "username") String username,@RequestParam(name = "pass") String password,HttpSession session)  
    {  
		Admin admin;
		

		admin = adminservice.loginCheck(username, password);
if(admin==null)		
{

			ModelAndView mnv = new ModelAndView("AdminLogin.jsp");
			mnv.addObject("Error","invalid credentials");
			return mnv;
		}
		//session code
else {
		session.setAttribute("username", "username");
		session.setAttribute("pass", "password");
		ModelAndView mnv = new ModelAndView("AdminWelcome.jsp");
        return mnv;
    }
    }
	
	@RequestMapping(path="viewrequests.lti" , method = RequestMethod.POST)
	public ModelAndView viewlistedCrops(HttpSession session) {
		ModelAndView mnv = new ModelAndView("AdminViewRequests.jsp");
		List<ListedCrops> li = adminservice.viewrequests();
		System.out.println(li.size());
		mnv.addObject("list", li);
		mnv.addObject("session",session);
		return mnv;

	}
	
	@RequestMapping(path = "logoutadmin.lti", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "home.jsp";
	}
}
