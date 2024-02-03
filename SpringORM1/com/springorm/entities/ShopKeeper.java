package com.springorm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shopdetails")
public class ShopKeeper {
	
	@Id   
	@Column(name = "sNo")
	private int shopNo;
	
	@Column(name = "sName")
	private String name;
	
	@Column(name = "shopadd")
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getShopNo() {
		return shopNo;
	}
	public void setShopNo(int shopNo) {
		this.shopNo = shopNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public ShopKeeper(int shopNo, String name, String address) {
		super();
		this.name = name;
		this.shopNo = shopNo;
		this.address = address;
	}
	public ShopKeeper() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
