package tn.enis.pizza;

import tn.enis.factory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
	private PizzaIngredientFactory ingredientfactory;

	public PepperoniPizza(PizzaIngredientFactory ingredientfactory) {
		this.ingredientfactory = ingredientfactory;
	}

	@Override
	public void prepare() {
		System.out.println("Préparons " + name);
		dough = ingredientfactory.createDough();
		sauce = ingredientfactory.createSauce();
		cheese = ingredientfactory.createCheese();
		pepperoni = ingredientfactory.createPepperoni();
	}

}
