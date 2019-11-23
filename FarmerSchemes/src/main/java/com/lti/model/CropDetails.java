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
@Table(name = "table_cropdetails")
public class CropDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Crop")
	@SequenceGenerator(name = "Crop",sequenceName="crop_seq" ,initialValue = 50000, allocationSize = 10)
	private int cropId;
	private String cropName;
	private String cropType;
	private String fertilizerType;
	private int rate;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="farmerid")
	 private Farmer farmer;

	public int getCropId() {
		return cropId;
	}

	public void setCropId(int cropId) {
		this.cropId = cropId;
	}

	public String getCropType() {
		return cropType;
	}

	public void setCropType(String cropType) {
		this.cropType = cropType;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	
	public Farmer getFarm() {
		return farmer;
	}

	public void setFarm(Farmer farmer) {
		this.farmer = farmer;
	}

	public String getCropName() {
		return cropName;
	}

	public void setCropName(String cropName) {
		this.cropName = cropName;
	}

	public String getFertilizerType() {
		return fertilizerType;
	}

	public void setFertilizerType(String fertilizerType) {
		this.fertilizerType = fertilizerType;
	}

	public Farmer getFarmer() {
		return farmer;
	}

	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}
	
	
}
