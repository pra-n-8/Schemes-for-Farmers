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
@Table(name="table_LandDetails")
public class LandDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "land_no")
	@SequenceGenerator(name = "land_no",sequenceName="land_seq"  , allocationSize = 1)
	private int plotNo;
	
	private double landArea;
	private String landAddress;
	private int pincode;
	
	@ManyToOne
	@JoinColumn(name = "farmer_farmerid")
	private Farmer farmer;

	public int getPlotNo() {
		return plotNo;
	}

	public void setPlotNo(int plotNo) {
		this.plotNo = plotNo;
	}

	public double getLandArea() {
		return landArea;
	}

	public void setLandArea(double landArea) {
		this.landArea = landArea;
	}

	public String getLandAddress() {
		return landAddress;
	}

	public void setLandAddress(String landAddress) {
		this.landAddress = landAddress;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Farmer getFarmer() {
		return farmer;
	}

	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}
	
	
	
}
