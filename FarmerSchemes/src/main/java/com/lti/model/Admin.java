package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Table_Admin")
public class Admin {

	@Id
	// @GeneratedValue
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "admin_gen")
	@SequenceGenerator(name = "admin_gen", sequenceName = "admin_seq", initialValue = 1, allocationSize = 1)
	private int adminId;
	private String adminUname;
	private String adminPassword;
	public int getAdminId() {
		return this.adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminUname() {
		return this.adminUname;
	}
	public void setAdminUname(String adminUname) {
		this.adminUname = adminUname;
	}
	public String getAdminPassword() {
		return this.adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	
	
	
}
