# E-CS3330-Hw5

CS 3330 module 5 homework

Authors: Blake Simpson, Ethan Alexander, Jonathan Hatfield, Brian Bluhm

Methods:
- printListOfToppingsByPizaOrderID(int orderID)
- printPizzaOrderCart(int orderID)
- addPizzaToCart(PizzaType pizzaType)
- addNewToppingToPizza(int orderID, Toppings topping)
- removeToppingFromPizza(int orderID, Toppings topping)
- isThereAnyUncookedPizza()
- checkout()
- selectCookingStrategyByPizzaOrderID(int orderID, CookingStyleType cookingStrategyType)

Contributions:

Ethan Alexander: Setup some of the sub classes for abstract pizza, setup pizza factory, and setup the method addNewToppingToPizza. Also made a couple changes to the Enum class PizzaType and made some changes to iCookingStrategy subclasses.

Blake Simpson: Worked on addNewTopping method, removeTopping method, checkout method, selectCookingStrategy method, isThereAnyUncookedPizza method, the ICookingStrategy subclasses (Brick_oven, Conventional_oven, Microwave), and testing.

Jonathan Hatfield: Worked on AbstractPizza attributes, enums with constructor and getter methods, Added attributes to pizza order and constructors, Added printListOfToppingsByPizzaOrderID method, Added getPIzzaByOrderID method, Added addPizzaToCart method, Added printPizzaOrderCart method, Added an orderIDcounter to the PizzaCookingFactory class, finished the marg pizza class, and worked on add and remove toppings method 

Brian Bluhm: Repository creation, creation of all files and baseline classes, PizzaOrder class and PizzaOrder implementation of PizzaCookingFactory, ICookingStrategy and pizzaOrderList, Javadocs and comments alterations
