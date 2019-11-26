package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "table_currentbid")
public class CurrentBid {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bid")
	@SequenceGenerator(name = "bid",sequenceName="current_seq", initialValue = 1000, allocationSize = 2)
	private int bidId;
	
	private double amount;

	@ManyToOne(cascade = CascadeType.ALL) // check if bidder is added dynamiclly for each and every bid
	@JoinColumn(name = "bidderId")
	private Bidder bidder;

	@ManyToOne
	@JoinColumn(name = "listing_id")
	private ListedCrops crop;

	public int getBidId() {
		return bidId;
	}

	public void setBidId(int bidId) {
		this.bidId = bidId;
	}

	public Bidder getBidder() {
		return bidder;
	}

	public void setBidder(Bidder bidder) {
		this.bidder = bidder;
	}

	public ListedCrops getCrop() {
		return crop;
	}
	public void setCrop(ListedCrops crop) {
		this.crop = crop;
	}

	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

}
