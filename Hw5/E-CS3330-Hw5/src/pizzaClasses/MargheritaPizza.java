package pizzaClasses;

public class MargheritaPizza extends AbstractPizza {
	

	//Constructor
	public MargheritaPizza() {
		super();
		
		//sets default price
		setPriceWithoutToppings(2.50);
		
		//adds default toppings
		toppingList.add(Toppings.TOMATO);
		toppingList.add(Toppings.CHEESE);
		
		//calls method to add topping prices
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
	
	@Override
	public String toString() {
		return "MargheritaPizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", pizzaOrderID=" + pizzaOrderID + ", cookingStrategy="
				+ cookingStrategy + ", cookingPrice=" + cookingPrice + "]";
	}
//sets total price by calling the update pizza method which requires the currently known price and returns the newly updated price
	public double updatePrice() {
		this.setTotalPrice(this.updatePizzaPrice(this.getTotalPrice()));
		return this.getTotalPrice();
	}
	
}
