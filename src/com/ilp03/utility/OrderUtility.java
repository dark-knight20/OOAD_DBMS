package com.ilp03.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp03.entity.Customer;
import com.ilp03.entity.Order;
import com.ilp03.entity.RestaurantMenu;
import com.ilp03.service.OrderService;

public class OrderUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		ArrayList<Order> orderList=new ArrayList<Order>();
		RestaurantMenu restaurantMenu=OrderService.getMenu();
		OrderService.displayMenu(restaurantMenu);
		char choice='y';
		System.out.println("Enter customer details...");
		Customer customer=OrderService.getCustomerDetails();
		
		do {
		System.out.println("1.Online Order.   2.OnSite Order.  3. View Order Detials");
		int orderChoice=scanner.nextInt();
		
		switch(orderChoice)
		{
		case 1:orderList.add(OrderService.getOrder(restaurantMenu,customer,orderChoice));
			   break;
		case 2:orderList.add(OrderService.getOrder(restaurantMenu,customer,orderChoice));
			   break;
		case 3:OrderService.displayOrderDetails(orderList);
				break;
		default:System.out.println("Wrong entry... choose again");		
		}
		
		System.out.println("Do you want to go to menu (y or n)");
		choice=scanner.next().charAt(0);
		}while(choice=='y');
	}

}
