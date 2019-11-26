package com.lti.dao;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Bidder;
import com.lti.model.CurrentBid;
import com.lti.model.ListedCrops;

@Component("bidderdao")
public class BidderDao {
	
	@PersistenceContext
	private EntityManager em;
@Transactional
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
@Transactional
	public List<ListedCrops> retrieve(LocalDateTime time) {
		// TODO Auto-generated method stub
		Query query= em.createQuery("select l from ListedCrops l join fetch l.crop c where l.expiryTime > :t");
		query.setParameter("t", time);
		List<ListedCrops> li = query.getResultList();
		return li;
	}
@Transactional
	public Boolean register(Object obj) {
		addEntity(obj);
		return null;
	}
@Transactional
	public ListedCrops getCrop(int id) {
		// TODO Auto-generated method stub
		Query query = em.createQuery("Select lc from ListedCrops lc where lc.listingId = :lId");
		query.setParameter("lId", id);
		return (ListedCrops) query.getSingleResult();
	}
}
