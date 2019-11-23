package com.lti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.interfaces.AdminServiceInterface;
import com.lti.model.Admin;


@Controller
public class AdminController{

	@RequestMapping(path="admin.lti",method=RequestMethod.POST)
    public String addNew(Admin admin)  
    {  
		
        return "home.jsp";  
    }

	public Admin loginCheck(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public String addNew(Object obj) {
		// TODO Auto-generated method stub
		return null;
	} 
	
}
