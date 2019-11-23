package com.lti.interfaces;

import org.springframework.stereotype.Service;

import com.lti.model.Farmer;

@Service("bidderSservice")
public interface BidderServiceInterface {
	public String addNew(Object obj);

	public Farmer loginCheck(String username, String password);

}
