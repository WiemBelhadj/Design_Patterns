package tn.enis.store;

import tn.enis.factory.PizzaIngredientFactory;
import tn.enis.factory.SfaxPizzaIngredientFactory;
import tn.enis.pizza.CheesePizza;
import tn.enis.pizza.ClamPizza;
import tn.enis.pizza.PepperoniPizza;
import tn.enis.pizza.Pizza;

public class SfaxStylePizzaStore extends PizzaStore {
	private PizzaIngredientFactory sfaxIngredientfactory = new SfaxPizzaIngredientFactory();

	@Override
	public Pizza createPizza(String item) {
		Pizza pizza = null;
		if (item.equals("cheese")) {
			pizza = new CheesePizza(sfaxIngredientfactory);
			pizza.setName("Sfax Style Cheese Pizza");
		} else if (item.equals("pepperoni")) {
			pizza = new PepperoniPizza(sfaxIngredientfactory);
			pizza.setName("Sfax Style Pepperoni Pizza");
		} else if (item.equals("clam")) {
			pizza = new ClamPizza(sfaxIngredientfactory);
			pizza.setName("Sfax Style Clam Pizza");
		}
		return pizza;
	}

}
