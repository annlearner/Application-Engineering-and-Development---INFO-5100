package com.java1995;

public class Pizza {
	/**
	 * @param loyaltyPoints
	 */
	public Pizza(int loyaltyPoints) {
		super();
		this.loyaltyPoints = loyaltyPoints;
	}
	/**
	 * @param unitPrice
	 */
	public Pizza(double unitPrice) {
		super();
		this.unitPrice = unitPrice;
	}
	/**
	 * @param pizzaType
	 */
	public Pizza(String pizzaType) {
		super();
		this.pizzaType = pizzaType;
	}
	String pizzaType;
	double unitPrice;
	int loyaltyPoints;

}
