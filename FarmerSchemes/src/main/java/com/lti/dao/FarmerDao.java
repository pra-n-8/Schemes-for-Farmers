package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.lti.model.Farmer;
import com.lti.model.ListedCrops;

@Component("farmerdao")
@SessionAttributes("farmer")
public class FarmerDao{

	@PersistenceContext
	private EntityManager em;

	@Transactional
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
		return em.find(clazz, Id);
	}

	public Boolean register(Object obj) {
		addEntity(obj);
		return null;
	}
	
	@Transactional
	public List<ListedCrops> retriveCrops(Farmer farmer){
		Query query = em.createQuery("select c from ListedCrops c where c.farmer = :ut");
		query.setParameter("ut", farmer);
		
		List<ListedCrops> crop = query.getResultList();
		return crop;
	}

}
