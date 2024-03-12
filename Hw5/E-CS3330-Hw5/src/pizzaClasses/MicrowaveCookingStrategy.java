package pizzaClasses;

public class MicrowaveCookingStrategy implements ICookingStrategy {
	
	
	public MicrowaveCookingStrategy() {
		// TODO Auto-generated constructor stub
		//Must implement ICookingStrategy
	}

	@Override
	public boolean cook(AbstractPizza pizza) {
		// TODO Auto-generated method stub
		//pizza.setCookingStrategy(CookingStyleType.MICROWAVE);
		//pizza.totalPrice = pizza.totalPrice + 1.00;
		
		if(pizza.getCookingStrategy() == null) {
			pizza.setCookingPrice(1.0);
			pizza.setCookingStrategy(this);
			pizza.setTotalPrice(pizza.getPriceWithoutToppings() + pizza.getCookingPrice());
			
			return true;
		}
		
		return false;
	}
}
