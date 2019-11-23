package com.lti.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "table_farmerdetails")
public class Farmer {
	@Id
	// @GeneratedValue
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "farmer_gen")
	@SequenceGenerator(name = "farmer_gen", sequenceName = "farm_seq", initialValue = 1, allocationSize = 1)
	private int farmerId;
	private String farmerName;
	private String farmerAddress;
	private String farmerEmail;
	private String farmerCity;
	private String farmerState;
	private int farmerPinCode;
	private int farmerContact;
	private int farmerAadharCard;
	private String farmerPanCard;
	private int farmerInsuranceId;
	private String farmerPassword;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bankId")
	private BankDetails bank;

	@OneToMany(cascade = CascadeType.ALL,mappedBy="farmer")
	private List<CropDetails> crop;

	public BankDetails getBank_id() {
		return bank;
	}

	public void setBank_id(BankDetails bank_id) {
		this.bank = bank_id;
	}

	public int getFarmerId() {
		return farmerId;
	}

	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}

	public String getFarmerName() {
		return farmerName;
	}

	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}

	public String getFarmerAddress() {
		return farmerAddress;
	}

	public void setFarmerAddress(String farmerAddress) {
		this.farmerAddress = farmerAddress;
	}

	public String getFarmerEmail() {
		return farmerEmail;
	}

	public void setFarmerEmail(String farmerEmail) {
		this.farmerEmail = farmerEmail;
	}

	public String getFarmerCity() {
		return farmerCity;
	}

	public void setFarmerCity(String farmerCity) {
		this.farmerCity = farmerCity;
	}

	public String getFarmerState() {
		return farmerState;
	}

	public void setFarmerState(String farmerState) {
		this.farmerState = farmerState;
	}

	public int getFarmerPinCode() {
		return farmerPinCode;
	}

	public void setFarmerPinCode(int farmerPinCode) {
		this.farmerPinCode = farmerPinCode;
	}

	public int getFarmerContact() {
		return farmerContact;
	}

	public void setFarmerContact(int farmerContact) {
		this.farmerContact = farmerContact;
	}

	public int getFarmerAadharCard() {
		return farmerAadharCard;
	}

	public void setFarmerAadharCard(int farmerAadharCard) {
		this.farmerAadharCard = farmerAadharCard;
	}

	public String getFarmerPanCard() {
		return farmerPanCard;
	}

	public void setFarmerPanCard(String farmerPanCard) {
		this.farmerPanCard = farmerPanCard;
	}

	public int getFarmerInsuranceId() {
		return farmerInsuranceId;
	}

	public void setFarmerInsuranceId(int farmerInsuranceId) {
		this.farmerInsuranceId = farmerInsuranceId;
	}

	public String getFarmerPassword() {
		return farmerPassword;
	}

	public void setFarmerPassword(String farmerPassword) {
		this.farmerPassword = farmerPassword;
	}

	public BankDetails getBank() {
		return bank;
	}

	public void setBank(BankDetails bank) {
		this.bank = bank;
	}

	public List<CropDetails> getCrop() {
		return crop;
	}

	public void setCrop(List<CropDetails> crop) {
		this.crop = crop;
	}

	@Override
	public String toString() {
		return "Farmer [farmerId=" + farmerId + ", farmerName=" + farmerName + ", farmerAddress=" + farmerAddress
				+ ", farmerEmail=" + farmerEmail + ", farmerCity=" + farmerCity + ", farmerState=" + farmerState
				+ ", farmerPinCode=" + farmerPinCode + ", farmerContact=" + farmerContact + ", farmerAadharCard="
				+ farmerAadharCard + ", farmerPanCard=" + farmerPanCard + ", farmerInsuranceId=" + farmerInsuranceId
				+ ", farmerPassword=" + farmerPassword + ", bank=" + bank + ", crop=" + crop + "]";
	}

}
