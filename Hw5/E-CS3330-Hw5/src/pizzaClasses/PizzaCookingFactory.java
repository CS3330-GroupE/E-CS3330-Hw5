package pizzaClasses;

public class PizzaCookingFactory {
	
	
	private static int orderIDCounter = 1;	
	
	public AbstractPizza createPizza(PizzaType pizzaType) {
		
		
	AbstractPizza pizza = null;
	//Create Hawaiian pizza	
	if(pizzaType.equals(PizzaType.HAWAIIAN)) {
		pizza = new HawaiianPizza();
	}
	//Create Margherita pizza
	else if(pizzaType.equals(PizzaType.MARGHERITA)) {
		pizza = new MargheritaPizza();
	}
	//Create Supreme pizza
	else if(pizzaType.equals(PizzaType.SUPREME)) {
		pizza = new SupremePizza();
	}
	
	//Create vegetarian pizza
	else if(pizzaType.equals(PizzaType.VEGETARIAN)) {
		pizza = new VegetarianPizza();
	}
	
	else {
		System.out.println("Invalid Pizza Type");
	}
	
	 pizza.setPizzaOrderID(orderIDCounter++);
	 
	 return pizza;
	}
}
