package pizzaClasses;

public class ConventionalOvenCookingStrategy implements ICookingStrategy {

	public ConventionalOvenCookingStrategy() {
	}

	/** <p> sets cooking strategy to BrickOvenCooking to pizza object, sets price to 8.00 and adds to total </p>
	*/
	@Override
	public boolean cook(AbstractPizza pizza) {
			pizza.setCookingPrice(8.0);
			pizza.setCookingStrategy(this);
			pizza.totalPrice += pizza.getCookingPrice();
			
			return true;
		}
}
