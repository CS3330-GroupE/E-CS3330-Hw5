package pizzaClasses;

public class BrickOvenCookingStrategy implements ICookingStrategy {

	public BrickOvenCookingStrategy() {
	}

	/** <p> overrides ICookingStrategy, gives the pizza object this cooking strategy </p>
 	@param pizza = pizza object
  	<p> sets cooking price and strategy, adds to totalPrice </p>
	*/
	@Override
	public boolean cook(AbstractPizza pizza) {
			pizza.setCookingPrice(10.0);
			pizza.setCookingStrategy(this);
			pizza.totalPrice += pizza.getCookingPrice();
			
			return true;
	}
}
