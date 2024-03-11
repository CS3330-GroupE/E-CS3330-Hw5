package pizzaClasses;

public enum PizzaType {
	HAWAIIAN,
	MARGHERITA,
	SUPREME,
	VEGETARIAN;
	
	private double toppingPrice;
	
	private PizzaType(double toppingPrice) {
	      this.toppingPrice = toppingPrice;
	}

	public double getToppingPrice() {
		return toppingPrice;
	}
	
}
