package pizzaClasses;

public class HawaiianPizza extends AbstractPizza {

		// TODO Auto-generated constructor stub
		public HawaiianPizza() {
			super();
			
			//sets default price
			setPriceWithoutToppings(3.00);
			
			//adds default toppings
			toppingList.add(Toppings.CANADIAN_BACON);
			toppingList.add(Toppings.CHEESE);
			toppingList.add(Toppings.PINEAPPLE);
			
			//calls method to add topping prices
			setTotalPrice(addToppingsToPrice(priceWithoutToppings));
		}
		
		//copy Constructor
		public HawaiianPizza (HawaiianPizza pizza) {
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
			return "Hawaiian [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
					+ ", totalPrice=" + totalPrice + ", pizzaOrderID=" + pizzaOrderID + ", cookingStrategy="
					+ cookingStrategy + ", cookingPrice=" + cookingPrice + "]";
	}

}
