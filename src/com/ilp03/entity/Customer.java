package com.ilp03.entity;

public class Customer {
	
	private int id;
	private String name;
	private String location;
	private int age;
	public Customer(int id, String name, String location, int age) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
