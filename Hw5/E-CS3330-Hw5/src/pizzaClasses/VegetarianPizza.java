package pizzaClasses;

public class VegetarianPizza extends AbstractPizza {

	//Constructor
	public VegetarianPizza() {
		super();	
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
	
	//toString method
	@Override
	public String toString() {
		return "VegetarianPizza [getToppingList()=" + getToppingList() + ", getPriceWithoutToppings()="
				+ getPriceWithoutToppings() + ", getTotalPrice()=" + getTotalPrice() + ", getPizzaOrderID()="
				+ getPizzaOrderID() + ", getCookingStrategy()=" + getCookingStrategy() + ", getCookingPrice()="
				+ getCookingPrice() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
