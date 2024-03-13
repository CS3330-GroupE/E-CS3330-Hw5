package pizzaClasses;

import java.util.ArrayList;
import java.util.List;

//PizzaOrder class utilizes PizzaCookingFactory and ICookingStrategy, private methods pizzaFactory, cookingStrategy, and pizzaOrderList
public class PizzaOrder implements ICookingStrategy {
    private PizzaCookingFactory pizzaFactory;
    private ICookingStrategy cookingStrategy;
    private List<AbstractPizza> pizzaOrderList;
	
    
	//creates pizza object - utilizes PizzaCookingFactory and PizzaType enum
    public AbstractPizza createPizza(PizzaType pizzaType) {
        return pizzaFactory.createPizza(pizzaType);
    }
	
    //returns cookingStrategy to pizza
    public boolean cook(AbstractPizza pizza) {
        return cookingStrategy.cook(pizza);
    }
	
    //adds pizza object to order list
    public void addPizzaOrder(AbstractPizza pizza) {
        pizzaOrderList.add(pizza);
        
    }
    
     //Constructor (Left for comparison)
    public PizzaOrder() {
        pizzaFactory = new PizzaCookingFactory();
        pizzaOrderList = new ArrayList<>();
    }
    
	//method to print off the list of toppings based on given orderID
    public void printListOfToppingsByPizzaOrderID(int orderID) {
        
    	try {
        	
    		AbstractPizza pizza = getPizzaByOrderID(orderID);
            System.out.println("Toppings for order number " + orderID + ": ");           
            
            for (Toppings topping : pizza.getToppingList()) {
                System.out.println(topping);
            }             
        } 
        
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    
    // Method to get pizza by order ID
    public AbstractPizza getPizzaByOrderID(int orderID) {
    	
    	for (AbstractPizza pizza : pizzaOrderList) {
    		
    		if (pizza.getPizzaOrderID() == orderID) {
    			return pizza;
    		}
    	}
    	
    	System.out.println("Sorry. We could not find that order based on the ID provided.");
		return null;
    }
   
    //ttl
    // Method to print current shopping cart   
    public void printPizzaOrderCart(int orderID) {
        
    	
    	System.out.println("Current shopping cart includes:");
        
        for (AbstractPizza pizza : pizzaOrderList) {
            System.out.println(pizza.toString());
        }
    }
	
	
	   // Method create and add pizza to shopping cart
    public boolean addPizzaToCart(PizzaType pizzaType) {
        AbstractPizza pizza = pizzaFactory.createPizza(pizzaType);
        	
            pizzaOrderList.add(pizza);
            return true;
        }
	

	public boolean addNewToppingToPizza(int orderID, Toppings topping) {
		
		//looks for pizza
		for(AbstractPizza pizza : pizzaOrderList) {
			
			//this finds the order in question
			if(pizza.getPizzaOrderID() == orderID) {
				
				//iterates through current pizza's topping list and checks to see if topping exists
				for(Toppings check : pizza.getToppingList()) {
					
					//if the topping exists, return false
					if(check == topping) {
						return false;
					}
					
				}
				
				//otherwise, add the topping
				List<Toppings> temptoppingList = new ArrayList<Toppings>();
				
				//gets the current topping list and sets the temp equal to it and adds the topping
				temptoppingList = pizza.getToppingList();
				temptoppingList.add(topping);
			
				//sets the old topping list equal to the new one
				pizza.setToppingList(temptoppingList);
				
				double tempTotal = pizza.addToppingsToPrice(pizza.getPriceWithoutToppings());
                pizza.setTotalPrice(tempTotal + pizza.getCookingPrice());
				
				return true;
			}
		}
		//if finding the pizza fails, return false
		return false;
	}
	
	
	/**
	 * @author blake simpson
	 * @param orderID
	 * @param topping
	 * @return true on successful removal of topping
	 * @return false on failure to remove topping
	 */
	public boolean removeToppingFromPizza(int orderID, Toppings topping) {
		
		//looking for pizza
		for(AbstractPizza pizza : pizzaOrderList) {
			
			//finds pizza based on orderID
			if(pizza.getPizzaOrderID() == orderID) {
				
				List<Toppings> toppingList = pizza.getToppingList();
				
				for(Toppings check : pizza.getToppingList()) {
					
					if(check.equals(topping)) {
						toppingList.remove(topping);
						pizza.setToppingList(toppingList);
						
						double tempTotal = pizza.addToppingsToPrice(pizza.getPriceWithoutToppings());
		                pizza.setTotalPrice(tempTotal + pizza.getCookingPrice());
		                
						pizza.updatePizzaPrice();
						
						return true; //topping removed successfully
					}
				}
				
				return false; //topping not found
			}
		}
		
		return false; //order not found
	}
	
	
	/**
	 * @author blake simpson
	 * @return true if pizza is uncooked
	 * @return false if pizza is coooked
	 */
	public boolean isThereAnyUncookedPizza() {
		
		for(AbstractPizza pizza : pizzaOrderList) {
			
			if(pizza.getCookingStrategy() == null) {
				return true; //uncooked pizza
			}
		}
		
		
		return false; //no uncooked pizza found
	}
	
	//throws general exception if there is any uncooked pizza's -> isThereAnyUncookedPizza() method
	//searches through pizza list and adds up total price of all pizzas
	//returns total as double
	public double checkout() throws Exception {
		
		if(isThereAnyUncookedPizza()) {
			throw new Exception("There is still uncooked pizza(s) in the order");
		}
		
		double total = 0.0;
		
		for(AbstractPizza pizza : pizzaOrderList) {
			total += pizza.getTotalPrice();
		}
		
		return total;
	}
	
	/**
	 * @author blake simpson
	 * @param orderID
	 * @param cookingStrategyType
	 * @return true on successful selection
	 * @return false on failure to select pizza
	 */
	public boolean selectCookingStrategyByPizzaOrderID(int orderID, CookingStyleType cookingStrategyType) {
		
		//searching through list to find pizza by orderID
		for(AbstractPizza pizza : pizzaOrderList) {
			if(pizza.getPizzaOrderID() == orderID) {
				
				ICookingStrategy cookingStrat = null;
				
				//instantiating cookingStrat based on cookingStrategyType
				switch(cookingStrategyType) {
				case MICROWAVE:
					cookingStrat = new MicrowaveCookingStrategy();
					break;
					
				case CONVENTIONAL_OVEN:
					cookingStrat = new ConventionalOvenCookingStrategy();
					break;
					
				case BRICK_OVEN:
					cookingStrat = new BrickOvenCookingStrategy();
					break;
					
				default:
					System.out.println("Error: invalid cooking style");
					return false;
				}
				
				pizza.setCookingStrategy(cookingStrat);
				cookingStrat.cook(pizza);
				
				return true;
			}
		}
		return false;
	}
}
