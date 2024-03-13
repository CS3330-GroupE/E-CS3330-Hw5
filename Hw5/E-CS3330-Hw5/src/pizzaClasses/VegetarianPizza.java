package pizzaClasses;

public class VegetarianPizza extends AbstractPizza {

	/** <p> sets type of pizza, comes with specific toppings, alters pizza price </p>
	*/
	//Constructor
	public VegetarianPizza() {
		super();	
		//sets default price
		setPriceWithoutToppings(1.50);
		
		//adds default toppings
		toppingList.add(Toppings.TOMATO);
		toppingList.add(Toppings.CHEESE);
		toppingList.add(Toppings.BELL_PEPPER);
		toppingList.add(Toppings.BLACK_OLIVE);
		toppingList.add(Toppings.MUSHROOM);
	}
	
	public VegetarianPizza (VegetarianPizza pizza) {
	super();
	this.toppingList = pizza.getToppingList();
	this.cookingPrice = pizza.getCookingPrice();
	this.cookingStrategy = pizza.getCookingStrategy();
	this.pizzaOrderID = pizza.getPizzaOrderID();
	this.priceWithoutToppings = pizza.getPriceWithoutToppings();
	this.totalPrice = pizza.getTotalPrice();
	}
	
	/** <p> toString method sets pizza type information to a string, information on toppings and price </p>
	*/
	@Override
	public String toString() {
		return "VegetarianPizza [getToppingList()=" + getToppingList() + ", getPriceWithoutToppings()="
				+ getPriceWithoutToppings() + ", getTotalPrice()=" + getTotalPrice() + ", getPizzaOrderID()="
				+ getPizzaOrderID() + ", getCookingStrategy()=" + getCookingStrategy() + ", getCookingPrice()="
				+ getCookingPrice() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
