package pizzaClasses;

public class BrickOvenCookingStrategy implements ICookingStrategy{

	public BrickOvenCookingStrategy() {
		// TODO Auto-generated constructor stub
		//Must implement ICookingStrategy
	}

	@Override
	public boolean cook(AbstractPizza pizza) {
		// TODO Auto-generated method stub
		pizza.totalPrice = pizza.totalPrice + 10.0;
		return false;
	}

}
