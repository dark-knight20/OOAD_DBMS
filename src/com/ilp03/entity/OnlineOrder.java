package com.ilp03.entity;

import java.util.Scanner;

public class OnlineOrder extends Order{
	
	
	private double price;
	private String deliveryDetails;
	private RestaurantMenu restaurantMenu;
	
	public void delivery()
	{
		System.out.println("****Delivery Details****");
		System.out.println("Delivery Id: D101\nDelivery executive: John\nDelivery Location: "+customer.getLocation()+"\nAmount to be paid: "+price+"Delivery Type: Normal\n****Thank You****");
		
	}
	public void delivery(String premiumId)
	{
		System.out.println("****Delivery Details****");
		System.out.println("Delivery Id: D101\nDelivery executive: John\nDelivery Location: "+customer.getLocation()+"\nAmount to be paid: "+(price*1.1)+"Delivery Type: Fast\nFast Delivery ID:"+premiumId+"\n****Thank You****");
		
	}

	public OnlineOrder(int id, String orderStatus, Customer customer, double price, String deliveryDetails,
			RestaurantMenu restaurantMenu) {
		super(id, orderStatus, customer);
		this.price = price;
		this.deliveryDetails = deliveryDetails;
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
		Scanner scanner=new Scanner(System.in);
		System.out.println("Your online order is completed.\n");
		
		System.out.println("Select your delivery type.\n 1.Normal delivery.  2.Fast delivery.");
		int choice=scanner.nextInt();
		if (choice==1)
			this.delivery();
		else
			this.delivery("FD101");
		
	}

	
}
