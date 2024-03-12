package main;

import pizzaClasses.MargheritaPizza;
import pizzaClasses.Toppings;

public class Main {
	public static void main(String[] args) {
		// Instantiate a pizzaOrder, perform operations based on the requirements.
		// Adds pizzas to the cart, selects cooking strategies for the pizzas in the cart,
		// TODO
		
		//instantiate pizza object
		
		
		MargheritaPizza myPizzaTester = new MargheritaPizza();
		
		//displays marg pizza without toppings cost
		 System.out.println("Margherita Pizza Price without toppings: $" + String.format("%.2f", myPizzaTester.getPriceWithoutToppings())); 
		 
		 //displays the total price with default toppings
		 System.out.println("Margherita Pizza Price with toppings: $" + String.format("%.2f", myPizzaTester.getTotalPrice())); 
		 
		 //adds a new topping to the toppings arraylist
		 myPizzaTester.getToppingList().add(Toppings.BELL_PEPPER);
		 myPizzaTester.updatePrice();
		 
		 //displays current topping arraylist
		 System.out.println(myPizzaTester.getToppingList());  
		
		 //displays the current price  
		 System.out.println("Margherita Pizza Price with toppings: $" + String.format("%.2f", myPizzaTester.getTotalPrice()));
		 myPizzaTester.getToppingList().add(Toppings.BELL_PEPPER);
		 System.out.println(myPizzaTester.getToppingList());  
		 myPizzaTester.updatePrice();
		 
		 System.out.println("Margherita Pizza Price with toppings: $" + String.format("%.2f", myPizzaTester.getTotalPrice()));
		 
		 System.out.println(myPizzaTester.toString());
	}
}