package com.lti.dao;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Bidder;
import com.lti.model.ListedCrops;

@Component("bidderdao")
public class BidderDao {
	
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

	public List<ListedCrops> retrieve(LocalDateTime time) {
		// TODO Auto-generated method stub
		Query query= em.createQuery("select lc from ListedCrops lc where lc.expiryTime > :t");
		query.setParameter("t", time);
		List<ListedCrops> li = query.getResultList();
		return li;
	}

	public Boolean register(Object obj) {
		addEntity(obj);
		return null;
	}
}
