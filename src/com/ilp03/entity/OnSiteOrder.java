package com.ilp03.entity;

public class OnSiteOrder extends Order{
	
	private double price;
	private RestaurantMenu restaurantMenu;
	
	

	public OnSiteOrder(int id, String orderStatus, Customer customer, double price, RestaurantMenu restaurantMenu) {
		super(id, orderStatus, customer);
		this.price = price;
		this.restaurantMenu = restaurantMenu;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public RestaurantMenu getRestaurantMenu() {
		return restaurantMenu;
	}
	public void setRestaurantMenu(RestaurantMenu restaurantMenu) {
		this.restaurantMenu = restaurantMenu;
	}
	@Override
	public void getOrders() {
		// TODO Auto-generated method stub
		System.out.println("Your on-site order is completed");
		System.out.println("Total amount to be paid: "+this.getPrice()+"\n****Thank You****");
	}
	
	

}
