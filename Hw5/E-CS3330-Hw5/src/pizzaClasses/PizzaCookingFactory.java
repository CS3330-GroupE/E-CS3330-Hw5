package pizzaClasses;

public class PizzaCookingFactory {
	
	public AbstractPizza createPizza(PizzaType pizzaType) {
		
	AbstractPizza pizza = null;
	//Create Hawaiian pizza	
	if(pizzaType.equals(PizzaType.HAWAIIAN)) {
		pizza = new HawaiianPizza();
		return pizza;
	}
	//Create Margherita pizza
	else if(pizzaType.equals(PizzaType.MARGHERITA)) {
		pizza = new MargheritaPizza();
		return pizza;
	}
	//Create Supreme pizza
	else if(pizzaType.equals(PizzaType.SUPREME)) {
		pizza = new SupremePizza();
		return pizza;
	}
	
	//Create vegetarian pizza
	else if(pizzaType.equals(PizzaType.VEGETARIAN)) {
		pizza = new VegetarianPizza();
		return pizza;
	}
		return pizza;
	}
}
