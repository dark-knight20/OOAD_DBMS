package com.ilp03.entity;

public abstract  class Order {
	
	private int id;
	private String orderStatus;
	Customer customer;
	
	public abstract void getOrders();
	
	public Order(int id, String orderStatus, Customer customer) {
		super();
		this.id = id;
		this.orderStatus = orderStatus;
		this.customer = customer;
	}
	

	
	public String getOrderStatus() {
		return orderStatus;
	}



	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	

}
