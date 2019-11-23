package com.lti.model;

import java.time.LocalDate;

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
	private int basePrice;

	@ManyToOne(cascade = CascadeType.ALL) // check if bidder is added dynamiclly for each and every bid
	@JoinColumn(name = "bidderId")
	private Bidder bidder;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "crop_id")
	private CropDetails crop;

	private LocalDate postDate;
	private LocalDate expiryTime;
	
	
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

	public CropDetails getCrop() {
		return crop;
	}

	public void setCrop(CropDetails crop) {
		this.crop = crop;
	}

	public LocalDate getPostDate() {
		return postDate;
	}

	public void setPostDate(LocalDate postDate) {
		this.postDate = postDate;
	}

	public LocalDate getExpiryTime() {
		return expiryTime;
	}

	public void setExpiryTime(LocalDate expiryTime) {
		this.expiryTime = expiryTime;
	}

	public int getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}

}
