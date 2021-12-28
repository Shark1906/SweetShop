package com.sweetshop.demo;

public class Order {
	
	String name;
	double price;
	int quantity;
	double total;
	
	public Order(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.total = quantity*price;
	}

	@Override
	public String toString() {
		return "name=" + name + ", price=" + price + ", quantity=" + quantity + ", total=" + total;
	}
	
	
	

}
