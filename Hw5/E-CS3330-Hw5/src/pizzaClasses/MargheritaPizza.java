package pizzaClasses;

public class MargheritaPizza extends AbstractPizza {
	
	/** <p> sets type of pizza, comes with specific toppigs, alters price </p>
	*/
	//Constructor
	public MargheritaPizza() {
		super();
		
		/** sets default price
		*/
		setPriceWithoutToppings(2.50);
		
		/** adds default toppings
		*/
		toppingList.add(Toppings.TOMATO);
		toppingList.add(Toppings.CHEESE);
		
		/** calls method to add topping prices
		*/
		setTotalPrice(addToppingsToPrice(priceWithoutToppings));
	}
	
	//copy Constructor
	public MargheritaPizza (MargheritaPizza pizza) {
	super();
	this.toppingList = pizza.getToppingList();
	this.cookingPrice = pizza.getCookingPrice();
	this.cookingStrategy = pizza.getCookingStrategy();
	this.pizzaOrderID = pizza.getPizzaOrderID();
	this.priceWithoutToppings = pizza.getPriceWithoutToppings();
	this.totalPrice = pizza.getTotalPrice();
	}

	/** <p> creates a string referencing information given to the pizza object, type, toppings, and price </p>
	*/
	@Override
	public String toString() {
		return "MargheritaPizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", pizzaOrderID=" + pizzaOrderID + ", cookingStrategy="
				+ cookingStrategy + ", cookingPrice=" + cookingPrice + "]";
	}
	
}
