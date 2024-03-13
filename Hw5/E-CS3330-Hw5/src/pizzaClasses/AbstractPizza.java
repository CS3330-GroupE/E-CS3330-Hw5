package pizzaClasses;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPizza {

	//attributes
	protected List<Toppings> toppingList;
	protected double priceWithoutToppings;
	protected double totalPrice;
	protected int pizzaOrderID;
	protected static int orderIDCounter;
	protected ICookingStrategy cookingStrategy;
	protected double cookingPrice;
	
	// calculates the total price of the pizza using
	//priceWithoutToppings and the prices of each topping in the toppingsList.
	protected double addToppingsToPrice(double priceWithoutToppings) {
	
		double total = priceWithoutToppings;
		for(Toppings topping : toppingList) {
			total += topping.getToppingCost();
		}

		return total;
	}
	
	// calculates and updates the totalPrice of the pizza using 
	//priceWithoutToppings attribute and the prices of each
	//topping in the toppingsList
	public double updatePizzaPrice() {
		
		double total = addToppingsToPrice(getPriceWithoutToppings());
		
		
		return total;	
	}
	
	//constructor
	public AbstractPizza() {
		toppingList = new ArrayList<>();
	}
	
	//getters
	public List<Toppings> getToppingList() {
		return toppingList;
	}
	
	public double getPriceWithoutToppings() {
		return priceWithoutToppings;
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
	
	public int getPizzaOrderID() {
		return pizzaOrderID;
	}
	
	public static int getOrderIDCounter() {
		return orderIDCounter;
	}
	
	public ICookingStrategy getCookingStrategy() {
		return cookingStrategy;
	}
	
	public double getCookingPrice() {
		return cookingPrice;
	}
	
	//setters
	public void setToppingList(List<Toppings> toppingList) {
		this.toppingList = toppingList;
	}

	public void setPriceWithoutToppings(double priceWithoutToppings) {
		this.priceWithoutToppings = priceWithoutToppings;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public void setPizzaOrderID(int pizzaOrderID) {
		this.pizzaOrderID = pizzaOrderID;
	}

	public static void setOrderIDCounter(int orderIDCounter) {
		AbstractPizza.orderIDCounter = orderIDCounter;
	}

	public void setCookingStrategy(ICookingStrategy cookingStrategy) {
		this.cookingStrategy = cookingStrategy;
	}

	public void setCookingPrice(double cookingPrice) {
		this.cookingPrice = cookingPrice;
	}
	
	//sets total price by calling the update pizza method which requires the currently known price and returns the newly updated price
		public void updatePrice() {
			this.setTotalPrice(this.updatePizzaPrice());
			 System.out.println("Pizza Price with toppings: $" + String.format("%.2f", this.getTotalPrice()));
	}
	
	
}
