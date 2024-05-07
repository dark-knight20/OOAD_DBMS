package com.ilp03.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp03.entity.Customer;
import com.ilp03.entity.FoodItems;
import com.ilp03.entity.OnSiteOrder;
import com.ilp03.entity.OnlineOrder;
import com.ilp03.entity.Order;
import com.ilp03.entity.RestaurantMenu;

public class OrderService {

	public static RestaurantMenu getMenu() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		ArrayList<FoodItems> foodItemsList= new ArrayList<FoodItems>();
		char choice='y';
		
		System.out.println("****Enter the menu details****\n");
		
		do
		{
			System.out.println("Enter the Food Item Id");
			int itemId=scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter the Item Name");
			String itemName=scanner.nextLine();
			System.out.println("Enter the Item Price");
			double itemPrice=scanner.nextDouble();
			scanner.nextLine();
			System.out.println("Enter the Item Category");
			String itemCategory=scanner.nextLine();
			
			foodItemsList.add(new FoodItems(itemId,itemName,itemPrice,itemCategory));
			
			System.out.println("Do you want to add more items to the menu...(Y or N)");
			choice=scanner.next().charAt(0);
			
		}while(choice=='Y');
		
		RestaurantMenu restaurantMenu=new RestaurantMenu(1, foodItemsList);
		
		return restaurantMenu;
	}

	public static void displayMenu(RestaurantMenu restaurantMenu) {
		// TODO Auto-generated method stub
		
		System.out.println("****The Menu****");
		System.out.println("Item ID  Item Name  Item Price  Item Category");
		for (FoodItems menu: restaurantMenu.getFoodItems())
		{
			System.out.println(menu.getId()+"   "+menu.getItemName()+"   "+menu.getItemPrice()+"   "+menu.getItemCategory());
		}
	}

	
	public static Order getOrder(RestaurantMenu restaurantMenu, Customer customer,int orderChoice)
	{
		OrderService.displayMenu(restaurantMenu);
		int choice[] = new int[10];
		Order order=null;
		int index=0;
		Scanner scanner=new Scanner(System.in);
		ArrayList<FoodItems> selectedItems =new ArrayList<FoodItems>();
		String selectedItem;
		double totalAmount=0;
		char ysNo='y';
		
		while(ysNo=='y')
		{
			System.out.println("Choose your options...(select item id)\n");
			choice[index]=scanner.nextInt();
			for(FoodItems items:restaurantMenu.getFoodItems())
			{
				if(choice[index]==items.getId())
				{
					selectedItems.add(items);
				totalAmount+=items.getItemPrice();
				}
			}
			index++;
			System.out.println("Do you want to add more items...\n");
			ysNo=scanner.next().charAt(0);
		}
		RestaurantMenu selectedRestaurantMenu=new RestaurantMenu(0, selectedItems);
		
		if(orderChoice==1)
		{
			order=new OnlineOrder(0, "Active", customer, totalAmount,"Active", selectedRestaurantMenu);
			order.getOrders();	
		}
		if(orderChoice==2)
		{
			order=new OnSiteOrder(0, "Active", customer, totalAmount, selectedRestaurantMenu);
			order.getOrders();	
		}
	return order;
	}
//	public static OnlineOrder getOnlineOrder(RestaurantMenu restaurantMenu, Customer customer) {
//		// TODO Auto-generated method stub
//		OrderService.displayMenu(restaurantMenu);
//		int choice[] = new int[10];
//		int index=0;
//		Scanner scanner=new Scanner(System.in);
//		ArrayList<FoodItems> selectedItems =new ArrayList<FoodItems>();
//		String selectedItem;
//		double totalAmount=0;
//		char ysNo='y';
//		
//		System.out.println("Choose your options...(select item id)\n");
//		while(ysNo=='y')
//		{
//			choice[index]=scanner.nextInt();
//			for(FoodItems items:restaurantMenu.getFoodItems())
//			{
//				if(choice[index]==items.getId())
//					selectedItems.add(items);
//				totalAmount+=items.getItemPrice();
//			}
//			index++;
//			System.out.println("Do you want to add more items...\n");
//			ysNo=scanner.next().charAt(0);
//		}
//		RestaurantMenu selectedRestaurantMenu=new RestaurantMenu(0, selectedItems);
//		
//		OnlineOrder onlineOrder=new OnlineOrder(0, "Active", customer, totalAmount,"Active", selectedRestaurantMenu);
//		onlineOrder.getOrders();
//		return onlineOrder;
//	}

//	public static OnSiteOrder getOnSiteOrder(RestaurantMenu restaurantMenu, Customer customer) {
//		// TODO Auto-generated method stub
//		OrderService.displayMenu(restaurantMenu);
//		int choice[] = new int[10];
//		int index=0;
//		Scanner scanner=new Scanner(System.in);
//		ArrayList<FoodItems> selectedItems =new ArrayList<FoodItems>();
//		String selectedItem;
//		double totalAmount=0;
//		char ysNo='y';
//		
//		System.out.println("Choose your options...(select item id)\n");
//		while(ysNo=='y')
//		{
//			choice[index]=scanner.nextInt();
//			for(FoodItems items:restaurantMenu.getFoodItems())
//			{
//				if(choice[index]==items.getId())
//					selectedItems.add(items);
//				totalAmount+=items.getItemPrice();
//			}
//			index++;
//			System.out.println("Do you want to add more items...\n");
//			ysNo=scanner.next().charAt(0);
//		}
//		RestaurantMenu selectedRestaurantMenu=new RestaurantMenu(0, selectedItems);
//		
//		OnSiteOrder onSiteOrder=new OnSiteOrder(0, "Active", customer, totalAmount, selectedRestaurantMenu);
//		onSiteOrder.getOrders();
//		return onSiteOrder;
//	}

	public static Customer getCustomerDetails() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter customer Id");
		int customerId=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter customer Name");
		String customerName=scanner.nextLine();
		System.out.println("Enter customer location");
		String customerLocation=scanner.nextLine();
		System.out.println("Enter customer age");
		int customerAge=scanner.nextInt();
		
		Customer customer=new Customer(customerId,customerName,customerLocation,customerAge);
		return customer;
	}

//	public static void displayOnlineOrderDetails(OnlineOrder onlineOrder) {
//		// TODO Auto-generated method stub
//		System.out.println("****Your online order details****");
//		System.out.println("Order ID   Status   Customer Name   Total Amount");
//		System.out.println(onlineOrder.getId()+onlineOrder.getOrderStatus()+onlineOrder.getCustomer().getName());
//		
//		for(FoodItems items :onlineOrder.getRestaurantMenu().getFoodItems())
//		{
//			System.out.println("Item ID  Item Name  Item Price  Item Category");
//			System.out.println(items.getId()+items.getItemName()+items.getItemPrice()+items.getItemCategory());
//		}
//		
//		System.out.println("Total Amount :"+onlineOrder.getPrice()+"\n Thank you for ordering, have a nice day...");
//	}
//
//	public static void displayOnSiteOrderDetails(OnSiteOrder onsiteOrder) {
//		// TODO Auto-generated method stub
//		System.out.println("****Your onsite order details****");
//		System.out.println("Order ID   Status   Customer Name   Total Amount");
//		System.out.println(onsiteOrder.getId()+onsiteOrder.getOrderStatus()+onsiteOrder.getCustomer().getName());
//		
//		for(FoodItems items :onsiteOrder.getRestaurantMenu().getFoodItems())
//		{
//			System.out.println("Item ID  Item Name  Item Price  Item Category");
//			System.out.println(items.getId()+items.getItemName()+items.getItemPrice()+items.getItemCategory());
//		}
//		
//		System.out.println("Total Amount :"+onsiteOrder.getPrice()+"\n Thank you for ordering, have a nice day...");
//	}

	public static void displayOrderDetails(ArrayList<Order> orderList) {
		// TODO Auto-generated method stub
		for(Order order:orderList)
		{
			if(order instanceof OnlineOrder)
			{
				OnlineOrder onlineOrder=(OnlineOrder)order;
				System.out.println("****Your online order details****");
				System.out.println("Order ID   Status   Customer Name   ");
				System.out.println(order.getId()+"    "+order.getOrderStatus()+"    "+order.getCustomer().getName());
				
				for(FoodItems items :onlineOrder.getRestaurantMenu().getFoodItems())
				{
					System.out.println("Item ID  Item Name  Item Price  Item Category");
					System.out.println(items.getId()+"    "+items.getItemName()+"    "+items.getItemPrice()+"    "+items.getItemCategory());
				}
				
				System.out.println("Total Amount :"+onlineOrder.getPrice()+"\n Thank you for ordering, have a nice day...");
			}
			else if(order instanceof OnSiteOrder)
			{
				OnSiteOrder onSiteOrder=(OnSiteOrder)order;
				System.out.println("****Your onsite order details****");
				System.out.println("Order ID   Status   Customer Name   ");
				System.out.println(order.getId()+"    "+order.getOrderStatus()+"    "+order.getCustomer().getName());
				
				for(FoodItems items :onSiteOrder.getRestaurantMenu().getFoodItems())
				{
					System.out.println("Item ID  Item Name  Item Price  Item Category");
					System.out.println(items.getId()+"    "+items.getItemName()+"    "+items.getItemPrice()+"    "+items.getItemCategory());
				}
				
				System.out.println("Total Amount :"+onSiteOrder.getPrice()+"\n Thank you for ordering, have a nice day...");
			}
		}
	}

	
	
	
}
