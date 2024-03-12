package pizzaClasses;

import java.util.ArrayList;
import java.util.List;

//PizzaOrder class utilizes PizzaCookingFactory and ICookingStrategy, private methods pizzaFactory, cookingStrategy, and pizzaOrderList
public class PizzaOrder implements ICookingStrategy {
    private PizzaCookingFactory pizzaFactory;
    private ICookingStrategy cookingStrategy;
    private List<AbstractPizza> pizzaOrderList;
	
    //PizzaOrder constructor - utilizes PizzaCookingFactory and ICookingStrategy - creates pizza type and cooking form
    public PizzaOrder(PizzaCookingFactory pizzaFactory, ICookingStrategy cookingStrategy) {
        this.pizzaFactory = pizzaFactory;
        this.cookingStrategy = cookingStrategy;
        this.pizzaOrderList = new ArrayList<>();
    }
	
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
    
    /* Constructor (Left for comparison)
    public PizzaOrder() {
        pizzaFactory = new PizzaCookingFactory();
        pizzaOrderList = new ArrayList<>();
    }
    */
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
    
    // Method to print current shopping cart
    public void printPizzaOrderCart(int orderID) {
        
    	System.out.println("Current shopping cart includes:");
        
        for (AbstractPizza pizza : pizzaOrderList) {
            System.out.println(pizza);
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
				
				//updates the price of the pizza
				pizza.addToppingsToPrice(orderID);
				
				return true;
			}
		}
		//if finding the pizza fails, return false
		return false;
	}
	
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
						pizza.updatePizzaPrice(pizza.totalPrice);
						
						return true; //topping removed successfully
					}
				}
				
				return false; //topping not found
			}
		}
		
		return false; //order not found
	}
	
	//returns true if it finds an uncooked pizza
	//returns false if there is no uncooked pizza
	public boolean isThereAnyUncookedPizza() {
		
		for(AbstractPizza pizza : pizzaOrderList) {
			
			if(pizza.getCookingStrategy() == null) {
				return true; //uncooked pizza
			}
		}
		
		
		return false; //no uncooked pizza found
	}
	
//	public double checkout() throws Exception{
//		return something;
//	}
	
	public boolean selectCookingStrategyByPizzaOrderID(int orderID, CookingStyleType cookingStrategyType) {
		return true;
	}
}
