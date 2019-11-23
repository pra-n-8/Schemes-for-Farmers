package com.lti.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LISTED_CROPS")
public class ListedCrops {
	@Id
	@GeneratedValue
	private int listingId;
	
	@ManyToOne
	@JoinColumn(name = "crop_id")
	private CropDetails crop;
	
	@ManyToOne
	@JoinColumn(name = "farmer_id")
	private Farmer farmer;
	
	private int quantity;
	private int basePrice;
	private LocalDateTime postTime;
	private LocalDateTime expiryTime;

	public int getQuantity() {
		return quantity;
	}

	public LocalDateTime getPostTime() {
		return postTime;
	}

	public void setPostTime(LocalDateTime postTime) {
		this.postTime = postTime;
	}

	public LocalDateTime getExpiryTime() {
		return expiryTime;
	}

	public void setExpiryTime(LocalDateTime expiryTime) {
		this.expiryTime = expiryTime;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}

	public CropDetails getCrop() {
		return crop;
	}

	public void setCrop(CropDetails crop) {
		this.crop = crop;
	}

	public Farmer getFarmer() {
		return farmer;
	}

	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}

	public int getListingId() {
		return listingId;
	}

	public void setListingId(int listingId) {
		this.listingId = listingId;
	}
}
