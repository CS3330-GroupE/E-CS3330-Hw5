package pizzaClasses;

public class MicrowaveCookingStrategy implements ICookingStrategy {
	
	
	public MicrowaveCookingStrategy() {
	}

	/** <p> sets cooking strategy to MicrowaveCookingStrategy to pizza object, sets price to 1.00 and adds to total </p>
	*/
	@Override
	public boolean cook(AbstractPizza pizza) {
		pizza.setCookingPrice(1.0);
		pizza.setCookingStrategy(this);
		pizza.totalPrice += pizza.getCookingPrice();
			
		return true;
	
	}
}
