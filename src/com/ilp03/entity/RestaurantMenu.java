package com.ilp03.entity;

import java.util.ArrayList;

public class RestaurantMenu {
	
	private int menuId;
	private ArrayList<FoodItems> foodItems;
	
	public RestaurantMenu(int menuId, ArrayList<FoodItems> foodItems) {
		super();
		this.menuId = menuId;
		this.foodItems = foodItems;
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public ArrayList<FoodItems> getFoodItems() {
		return foodItems;
	}
	public void setFoodItems(ArrayList<FoodItems> foodItems) {
		this.foodItems = foodItems;
	}
	
	

}
