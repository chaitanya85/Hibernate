package com.hibernateNQ.annotation.model;

import javax.persistence.*;
@Entity
@javax.persistence.Table(name="Cart")
@NamedQueries(value = { @NamedQuery(name= "SelectOperationforCart", query="from Cart"),
@NamedQuery(name="InsertOperationforCart",query="Insert into Cart values(1, 'chicken biryani', 100.32, 'nagarjuna')")})

public class Cart {
	@Id
	@Column(name = "Sno")
	private int Sno;
	@Column(name = "ItemName")
	private String ItemName;
	@Column(name = "Price")
	private int Price;
	@Column(name = "Restaurant")
	private String Restaurant;
	@Version
	@Column(name="version")
	private int version;
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public int getSno() {
		return Sno;
	}
	public void setSno(int sno) {
		Sno = sno;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int f) {
		Price = f;
	}
	public String getRestaurant() {
		return Restaurant;
	}
	public void setRestaurant(String restaurant) {
		Restaurant = restaurant;
	}
	@Override
	public String toString() {
		return "\n"+"Cart [Sno=" + Sno + ", ItemName=" + ItemName + ", Price=" + Price + ", Restaurant=" + Restaurant
				+ ", version=" + version + "]";
	}

	}

