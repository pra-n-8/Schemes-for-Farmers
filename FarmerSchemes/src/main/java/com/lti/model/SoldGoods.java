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
@Table(name = "table_soldgoods")
public class SoldGoods {

	private int sellingPrice;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sell_pr")
	@SequenceGenerator(name = "sell_pr",sequenceName="Sold_seq", allocationSize = 1)
	private int orderId;
	
	private int basePrice;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bidderId")
	private Bidder bidder;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "crop_id")
	private CropDetails crop;

	public int getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(int sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}

	public Bidder getBid() {
		return bidder;
	}

	public void setBid(Bidder bid) {
		this.bidder = bid;
	}

	public CropDetails getCrop() {
		return crop;
	}

	public void setCrop(CropDetails crop) {
		this.crop = crop;
	}

}
