package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.interfaces.GenericInterface;
import com.lti.interfaces.RegistrationLoginInterface;
import com.lti.model.Bidder;
import com.lti.model.Farmer;

@Component("bidderdao")
public class BidderDao implements GenericInterface, RegistrationLoginInterface {
	@PersistenceContext
	private EntityManager em;

	public void addEntity(Object entity) {
		em.merge(entity);

	}

	@Transactional
	public Object login(String username, String password) {
		Bidder bidder;
		Query query = em.createQuery("select b from Bidder b where b.bidderName = :uname and b.bidderPassword= :upass");
		query.setParameter("uname", username);
		query.setParameter("upass", password);
		System.out.println("In dao");
		try {
		bidder = (Bidder) query.getSingleResult();
		}
		catch(Exception e) {
			System.out.println(e);
			return null;
		}
		
		return bidder;
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
