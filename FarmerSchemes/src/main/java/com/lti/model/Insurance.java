package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "table_insurance")
public class Insurance {
 
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Insurance_No")
	@SequenceGenerator(name = "Insurance_No",sequenceName="insurance_seq"  , allocationSize = 1)
	private int insuranceNo;
	private String season;
	private String cropName;
	private  int sumInsured;
	private double area;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Farmer farmer;

	public int getInsuranceNo() {
		return insuranceNo;
	}

	public void setInsuranceNo(int insuranceNo) {
		this.insuranceNo = insuranceNo;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getCropName() {
		return cropName;
	}

	public void setCropName(String cropName) {
		this.cropName = cropName;
	}

	public int getSumInsured() {
		return sumInsured;
	}

	public void setSumInsured(int sumInsured) {
		this.sumInsured = sumInsured;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public Farmer getFarmer() {
		return farmer;
	}

	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}
	
	
}
