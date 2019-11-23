package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "table_bankdetails")
public class BankDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Bank_No")
	@SequenceGenerator(name = "Bank_No",sequenceName="bank_seq"  ,initialValue = 2000, allocationSize = 10)
	private int accountNumber;
	private String BankName;
	@OneToOne(mappedBy = "bank",cascade=CascadeType.ALL)
	private Bidder bidder;
	@OneToOne(mappedBy = "bank",cascade=CascadeType.ALL)
	private Farmer farmer;

	public int getBank_id() {
		return accountNumber;
	}

	public void setBank_id(int bank_id) {
		this.accountNumber = bank_id;
	}

	public String getBankName() {
		return BankName;
	}

	public void setBankName(String bankName) {
		BankName = bankName;
	}

	public Bidder getBid() {
		return bidder;
	}

	public void setBid(Bidder bid) {
		this.bidder = bid;
	}

	public Farmer getFarm() {
		return farmer;
	}

	public void setFarm(Farmer farm) {
		this.farmer = farm;
	}

}