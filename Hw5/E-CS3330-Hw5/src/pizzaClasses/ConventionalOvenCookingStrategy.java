package pizzaClasses;

public class ConventionalOvenCookingStrategy implements ICookingStrategy {
	//private ICookingStrategy ConventionalOvenCookingStrategy = CookingStyleType.MICROWAVE;

	public ConventionalOvenCookingStrategy() {
		// TODO Auto-generated constructor stub
		//Must implement ICookingStrategy
	}

	@Override
	public boolean cook(AbstractPizza pizza) {
		// TODO Auto-generated method stub
		
		
		//pizza.cookingStrategy = ConventionalOvenCookingStrategy;
		pizza.totalPrice = pizza.totalPrice + 8.0;
		return false;
	}
}
