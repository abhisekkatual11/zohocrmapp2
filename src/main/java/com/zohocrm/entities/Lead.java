package com.zohocrm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="leads_database")
public class Lead extends AbstractClass {
	@Column(name="Aadhaar_ID",nullable = false,unique = true,length = 12)
	private Long aadhaarId;
	@Column(name="Name",nullable = false,length = 56)
	private String name;
	@Column(name="Address",nullable = false,length = 156)
	private String address;
	@Column(name="Email_ID",nullable = false,unique = true,length = 128)
	private String email;
	@Column(name="Mobile_NO",nullable = false,length = 10)
	private Long mobile;
	public Long getAadhaarId() {
		return aadhaarId;
	}
	public void setAadhaarId(Long aadhaarId) {
		this.aadhaarId = aadhaarId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	
}
