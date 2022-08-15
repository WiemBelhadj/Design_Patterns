package tn.enis.pizza;

import tn.enis.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
	private PizzaIngredientFactory ingredientfactory;

	public CheesePizza(PizzaIngredientFactory ingredientfactory) {
		this.ingredientfactory = ingredientfactory;
	}

	@Override
	public void prepare() {
		System.out.println("Préparons " + name);
		dough = ingredientfactory.createDough();
		sauce = ingredientfactory.createSauce();
		cheese = ingredientfactory.createCheese();
	}
}
