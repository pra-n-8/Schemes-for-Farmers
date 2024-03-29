package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.FarmerDao;
import com.lti.model.CropDetails;
import com.lti.model.CurrentBid;
import com.lti.model.Farmer;
import com.lti.model.ListedCrops;

@Service("farmerService")
public class FarmerService {
	
	@Autowired
	private FarmerDao farmerdao;
	
	public Boolean register(Object obj) {
		farmerdao.addEntity(obj);
		return true;
	}

	public Object login(String username, String password) {
		Farmer farmer;
		try {
			farmer = (Farmer) farmerdao.login(username, password);
		} catch (NullPointerException e) {
			return null;
		}
		return farmer;
	}

	public void addToListing(CropDetails cropDetails,Farmer farmer) {

	}
	
	public List<ListedCrops> getCrops(Farmer farmer){
		return farmerdao.retriveCrops(farmer);
	}

//	List<CropDetails> li = farmer.getCrop();
//	li.add(cropDetails);
//	farmer.setCrop(li);
//	farmerdao.addEntity(farmer);
}
