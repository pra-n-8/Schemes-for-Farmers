package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Auction {
	@Id
	private int BidderId;
	@Column(name="BID_AMOUNT")
	private int BID_AMOUNT;
	@Column(name="CROPID")
	private int CROPID;
	
	public int getBidderId() {
		return BidderId;
	}
	public void setBidderId(int bidderId) {
		BidderId = bidderId;
	}
	public int getBID_AMOUNT() {
		return BID_AMOUNT;
	}
	public void setBID_AMOUNT(int bID_AMOUNT) {
		BID_AMOUNT = bID_AMOUNT;
	}
	public int getCROPID() {
		return CROPID;
	}
	public void setCROPID(int cROPID) {
		CROPID = cROPID;
	}

}
