package com.lti.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.BidderDao;
import com.lti.model.Bidder;
import com.lti.model.CurrentBid;
import com.lti.model.ListedCrops;

@Service("bidderservice")
public class BidderService  {
@Autowired
BidderDao bidder;
	public Boolean register(Object obj) {
		bidder.addEntity(obj);
		return true;
	}

	public Object login(String username, String password) {
		Bidder bidder1;
		try {
			bidder1 = (Bidder)bidder.login(username, password);
		} catch (NullPointerException e) {
			return null;
		}
		return bidder1;
	}
	public List<ListedCrops> viewCrops(){
		return bidder.retrieve(LocalDateTime.now());
	}
	public List<CurrentBid> viewCrops1(){
		return bidder.retrieve1(LocalDateTime.now());
	}
	
}
