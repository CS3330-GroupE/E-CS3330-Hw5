package pizzaClasses;

public class MicrowaveCookingStrategy implements ICookingStrategy{
	
	
	
	public MicrowaveCookingStrategy() {
		// TODO Auto-generated constructor stub
		//Must implement ICookingStrategy
		
		
	}

	@Override
	public boolean cook(AbstractPizza pizza) {
		// TODO Auto-generated method stub
	
	
			//pizza.setCookingStrategy(CookingStyleType.MICROWAVE);
			pizza.totalPrice = pizza.totalPrice + 1.00;
			return true;
		//return false;
	}
}
