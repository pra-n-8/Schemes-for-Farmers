package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.lti.model.Admin;

@Component("admindao")
public class AdminDao {

	@PersistenceContext 
	private EntityManager em;
	
	public Admin loginCheck(String username, String password) {
		Admin admin;
		Query query= em.createQuery("Select a from Admin a where a.adminUname=:uname and a.adminPassword = :pass");
		query.setParameter("uname", username);
		query.setParameter("pass", password);
		try {
			admin = (Admin) query.getSingleResult();
			}
			catch(Exception e) {
				System.out.println(e);
				return null;
			}
			
			return admin;
	}

}
