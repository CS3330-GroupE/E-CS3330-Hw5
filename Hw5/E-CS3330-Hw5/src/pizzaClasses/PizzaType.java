package pizzaClasses;

public enum PizzaType {
	HAWAIIAN,
	MARGHERITA,
	SUPREME,
	VEGETARIAN;
	
	private double toppingPrice;

	public double getToppingPrice() {
		return toppingPrice;
	}
	
}
