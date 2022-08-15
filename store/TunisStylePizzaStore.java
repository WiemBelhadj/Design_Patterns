package tn.enis.store;

import tn.enis.factory.PizzaIngredientFactory;
import tn.enis.factory.TunisPizzaIngredientFactory;
import tn.enis.pizza.CheesePizza;
import tn.enis.pizza.ClamPizza;
import tn.enis.pizza.PepperoniPizza;
import tn.enis.pizza.Pizza;

public class TunisStylePizzaStore extends PizzaStore {
	private PizzaIngredientFactory tunisIngredientfactory = new TunisPizzaIngredientFactory();

	@Override
	public Pizza createPizza(String item) {
		Pizza pizza = null;
		if (item.equals("cheese")) {
			pizza = new CheesePizza(tunisIngredientfactory);
			pizza.setName("tunis Style Cheese Pizza");
		} else if (item.equals("pepperoni")) {
			pizza = new PepperoniPizza(tunisIngredientfactory);
			pizza.setName("tunis Style Pepperoni Pizza");
		} else if (item.equals("clam")) {
			pizza = new ClamPizza(tunisIngredientfactory);
			pizza.setName("tunis Style Clam Pizza");
		}
		return pizza;
	}
}
