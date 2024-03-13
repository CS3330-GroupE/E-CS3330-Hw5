package main;
import pizzaClasses.CookingStyleType;
import pizzaClasses.PizzaOrder;
import pizzaClasses.PizzaType;
import pizzaClasses.Toppings;

public class Main {
	public static void main(String[] args) {
		// Instantiate a pizzaOrder, perform operations based on the requirements.
		// Adds pizzas to the cart, selects cooking strategies for the pizzas in the cart,
		// TODO
		
		PizzaOrder myOrder = new PizzaOrder();

		myOrder.addPizzaToCart(PizzaType.MARGHERITA);
		myOrder.selectCookingStrategyByPizzaOrderID(1, CookingStyleType.BRICK_OVEN);
		
		myOrder.addNewToppingToPizza(1, Toppings.BELL_PEPPER);
		myOrder.printPizzaOrderCart(1);
		
		myOrder.removeToppingFromPizza(1, Toppings.BELL_PEPPER);
		myOrder.printPizzaOrderCart(1);
		
		try {
            // Calls checkout to calculate the bill
            double totalBill = myOrder.checkout();
            System.out.println("Total Bill: $" + totalBill);
            
        } catch (Exception e) {
            // Throws exception if there is at least one uncooked pizza
        	
            System.out.println("Error: " + e.getMessage());
        }
    }
		 
		 
		
	
}
