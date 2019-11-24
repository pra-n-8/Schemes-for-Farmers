package com.lti.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Farmer;

@Component("genericDao")
public class InputDao {
	@PersistenceContext
	private EntityManager em;

	@Transactional
	public void addEntity(Object entity) {
		em.merge(entity);

	}

	public Object retrieve(int Id, Class clazz) {
		Object entity = (Object) em.find(clazz, Id);
		return entity;
	}
	
	
}
