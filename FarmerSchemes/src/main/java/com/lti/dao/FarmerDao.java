package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.interfaces.GenericInterface;
import com.lti.interfaces.RegistrationLoginInterface;
import com.lti.model.Farmer;

@Component("farmerdao")
public class FarmerDao implements GenericInterface, RegistrationLoginInterface {
	@PersistenceContext
	private EntityManager em;

	public void addEntity(Object entity) {
		em.merge(entity);

	}

	@Transactional
	public Object login(String username, String password) {
		Farmer farmer;
		Query query = em.createQuery("select f from Farmer f where f.farmerName = :uname and f.farmerPassword= :upass");
		query.setParameter("uname", username);
		query.setParameter("upass", password);
		System.out.println("In dao");
		try {
		farmer = (Farmer) query.getSingleResult();
		}
		catch(Exception e) {
			System.out.println(e);
			return null;
		}
		
		return farmer;
	}

	public Object retrieve(int Id, Class clazz) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean register(Object obj) {
		addEntity(obj);
		return null;
	}

}