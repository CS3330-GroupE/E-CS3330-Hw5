package pizzaClasses;

public class PizzaOrder {
	
	pizzaFactory(PizzaCookingFactory)
	
	cookingStrategy(ICookingStrategy)
	
	pizzaOrderList(List<AbstractPizza>)
	
	public void printListOfToppingsByPizzaOrderID(int orderID){
		
	}
	
	public void printPizzaOrderCart(int orderID) {
		
	}
	
	public AbstractPizza getPizzaByOrderID(int orderID) {
		return AbstractPizza;
	}
	
	public boolean addPizzaToCart(PizzaType pizzaType) {
		return true;
	}
	
	public boolean addNewToppingToPizza(int orderID, Toppings topping) {
		return true;
	}
	
	public boolean removeToppingFromPizza(int orderID, Toppings topping) {
		return true;
	}
	
	public boolean isThereAnyUncookedPizza() {
		return true;
	}
	
	public double checkout() throws Exception{
		return something;
	}
	
	public boolean selectCookingStrategyByPizzaOrderID(int orderID, CookingStyleType cookingStrategyType) {
		return true;
	}
}
