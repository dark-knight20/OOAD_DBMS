package com.ilp03.entity;

public class FoodItems {
	
	private int itemId;
	private String itemName;
	private double itemPrice;
	private String itemCategory;
	public FoodItems(int itemId, String itemName, double itemPrice, String itemCategory) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemCategory = itemCategory;
	}
	public int getId() {
		return itemId;
	}
	public void setId(int id) {
		this.itemId = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemCategory() {
		return itemCategory;
	}
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}
	
	
}
