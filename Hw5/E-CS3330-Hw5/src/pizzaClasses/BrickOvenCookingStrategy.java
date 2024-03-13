package pizzaClasses;

public class BrickOvenCookingStrategy implements ICookingStrategy {

	public BrickOvenCookingStrategy() {
		// TODO Auto-generated constructor stub
		//Must implement ICookingStrategy
	}

	@Override
	public boolean cook(AbstractPizza pizza) {
		// TODO Auto-generated method stub
		//pizza.totalPrice = pizza.totalPrice + 10.0;
			pizza.setCookingPrice(10.0);
			pizza.setCookingStrategy(this);
			pizza.totalPrice += pizza.getCookingPrice();
			
			return true;
	}
}
