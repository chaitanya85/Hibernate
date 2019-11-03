package com.hibernate.namedquery.model;

public class Cart {

	private int Sno;
	private String ItemName;
	private int Price;
	private String Restaurant;
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

