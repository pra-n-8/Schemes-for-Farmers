package com.lti.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "table_bidderdetails")
public class Bidder {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bidder_gen")
	@SequenceGenerator(name = "bidder_gen",sequenceName="bidder_gen", initialValue = 10000, allocationSize = 1)
	private int bidderId;
	private String bidderName;
	private String bidderAddress;
	private String bidderEmail;
	private String bidderCity;
	private String bidderState;
	private int bidderPinCode;
	private int bidderContact;
	private int bidderAadharCard;
	private String bidderPanCard;
	private String bidderPassword;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bankId")
	private BankDetails bank;
	
	@OneToMany(mappedBy="bidder",cascade = CascadeType.ALL)
	private List<SoldGoods> soldgoods;

	@OneToMany(mappedBy="bidder")
	private List<CurrentBid> currentbid;


	public List<SoldGoods> getSoldgoods() {
		return soldgoods;
	}

	public void setSoldgoods(List<SoldGoods> soldgoods) {
		this.soldgoods = soldgoods;
	}

	public BankDetails getBank() {
		return bank;
	}

	public void setBank(BankDetails bank) {
		this.bank = bank;
	}

	public int getBidderId() {
		return bidderId;
	}

	public void setBidderId(int bidderId) {
		this.bidderId = bidderId;
	}

	public String getBidderName() {
		return bidderName;
	}

	public void setBidderName(String bidderName) {
		this.bidderName = bidderName;
	}

	public String getBidderAddress() {
		return bidderAddress;
	}

	public void setBidderAddress(String bidderAddress) {
		this.bidderAddress = bidderAddress;
	}

	public String getBidderEmail() {
		return bidderEmail;
	}

	public void setBidderEmail(String bidderEmail) {
		this.bidderEmail = bidderEmail;
	}

	public String getBidderCity() {
		return bidderCity;
	}

	public void setBidderCity(String bidderCity) {
		this.bidderCity = bidderCity;
	}

	public String getBidderState() {
		return bidderState;
	}

	public void setBidderState(String bidderState) {
		this.bidderState = bidderState;
	}

	public int getBidderPinCode() {
		return bidderPinCode;
	}

	public void setBidderPinCode(int bidderPinCode) {
		this.bidderPinCode = bidderPinCode;
	}

	public int getBidderContact() {
		return bidderContact;
	}

	public void setBidderContact(int bidderContact) {
		this.bidderContact = bidderContact;
	}

	public int getBidderAadharCard() {
		return bidderAadharCard;
	}

	public void setBidderAadharCard(int bidderAadharCard) {
		this.bidderAadharCard = bidderAadharCard;
	}

	public String getBidderPanCard() {
		return bidderPanCard;
	}

	public void setBidderPanCard(String bidderPanCard) {
		this.bidderPanCard = bidderPanCard;
	}

	public String getBidderPassword() {
		return bidderPassword;
	}

	public void setBidderPassword(String bidderPassword) {
		this.bidderPassword = bidderPassword;
	}

	@Override
	public String toString() {
		return "Bidder [bidderId=" + bidderId + ", bidderName=" + bidderName + ", bidderAddress="
				+ bidderAddress + ", bidderEmail=" + bidderEmail + ", bidderCity=" + bidderCity
				+ ", bidderState=" + bidderState + ", bidderPinCode=" + bidderPinCode + ", bidderContact="
				+ bidderContact + ", bidderAadharCard=" + bidderAadharCard + ", bidderPanCard="
				+ bidderPanCard + ", bidderPassword=" + bidderPassword + ", bank=" + bank
				+ ", soldgoods=" + soldgoods + ", currentbid=" + currentbid + "]";
	}

	
	
}
