package com.zohocrm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="billings")
public class Billing extends AbstractClass {
	@Column(name="Aadhaar_ID",nullable = false,length = 12)
	private Long aadhaarId;
	@Column(name="Name",nullable = false,length = 56)
	private String name;
	@Column(name="Address",nullable = false,length = 156)
	private String address;
	@Column(name="Email_ID",nullable = false,length = 128)
	private String email;
	@Column(name="Mobile_NO",nullable = false,length = 10)
	private Long mobile;
	
	@Column(name="Product_Name",nullable = false,length = 156)
	private String productName;
	
	@Column(name="Quantity",nullable = false,length = 10)
	private int quantity;
	
	@Column(name="Amount",nullable = false,length = 10)
	private int amount;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
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
