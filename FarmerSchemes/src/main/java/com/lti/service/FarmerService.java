package com.lti.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.lti.interfaces.GenericInterface;
import com.lti.interfaces.FarmerServiceInterface;
import com.lti.model.Farmer;

@Service("farmerService")
public class FarmerService implements FarmerServiceInterface {
	@PersistenceContext
	private EntityManager em;

	public String addNew(Object obj) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		GenericInterface dao1 = (GenericInterface) ctx.getBean("genericDao");
		dao1.addEntity(obj);
		return "Success";
	}

	public void display() {
		// TODO Auto-generated method stub

	}

	public Farmer loginCheck(String username, String password) {
		Query query = em.createQuery("SELECT f FROM Farmer f where f.farmerName = :uname and f.farmerPassword = :upassword");
		query.setParameter("uname", username);
		query.setParameter("upassword", password);
		Farmer farmer = (Farmer) query.getSingleResult();
		return farmer;
	}


	
}
