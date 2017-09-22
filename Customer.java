package com.java1995;

public class Customer {
	String customerName;
    int pizzaOrderedNumber;
    public static void main(String args[]){
    	//I suggest use the "string[]" and "double[]" to record the pizzas' names and numbers ordered.
    	double moneySpent;
    	String[] pizzas=new String[5];
    	//Different price of 5 kinds of pizza.
    	double[] pizzaPrice={13.00,14.50,16.99,18.39,22.00};
    	//suppose if the customer order one 1st pizza,3 4th pizza.
    	moneySpent=1*pizzaPrice[1]+3*pizzaPrice[4];
        System.out.println(moneySpent);	
    }
}
