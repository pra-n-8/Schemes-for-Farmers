package com.lti.dao;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Admin;
import com.lti.model.CropDetails;
import com.lti.model.ListedCrops;

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
	
	
//	public List<CropDetails> fetchCropDetails() {
//		Query q1 = em.createQuery("SELECT c FROM table_cropdetails c");
//		List<CropDetails> crops = q1.getResultList();
//		return crops;
//	}
	@Transactional
	public List<ListedCrops> retrieve(LocalDateTime time) {
		// TODO Auto-generated method stub
		
		Query query= em.createQuery("select l from ListedCrops l join fetch l.crop c where l.expiryTime < :t");
		query.setParameter("t", time);
		List<ListedCrops> li = query.getResultList();
		return li;
	}
}
