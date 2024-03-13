package pizzaClasses;

public class SupremePizza extends AbstractPizza {

		/** <p> sets pizza type, comes with specific toppings, alters price </p>
		*/
		/** Constructor
		*/
		public SupremePizza() {
			super();
			
			/** sets default price
			*/
			setPriceWithoutToppings(3.50);
			
			/** adds default toppings
			*/
			toppingList.add(Toppings.TOMATO);
			toppingList.add(Toppings.CHEESE);
			toppingList.add(Toppings.BELL_PEPPER);
			toppingList.add(Toppings.PEPPERONI);
			toppingList.add(Toppings.ITALIAN_SAUSAGE);
			
			/** calls method to add topping prices
			*/
			setTotalPrice(addToppingsToPrice(priceWithoutToppings));
		}
		
		/** copy Constructor
		*/
		public SupremePizza (SupremePizza pizza) {
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
			return "SupremePizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
					+ ", totalPrice=" + totalPrice + ", pizzaOrderID=" + pizzaOrderID + ", cookingStrategy="
					+ cookingStrategy + ", cookingPrice=" + cookingPrice + "]";
		}

}

