package tn.enis.pizza;

import tn.enis.factory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
	private PizzaIngredientFactory ingredientfactory;

	public ClamPizza(PizzaIngredientFactory ingredientfactory) {
		this.ingredientfactory = ingredientfactory;
	}

	@Override
	public void prepare() {
		System.out.println("Préparons " + name);
		dough = ingredientfactory.createDough();
		sauce = ingredientfactory.createSauce();
		cheese = ingredientfactory.createCheese();
		clam = ingredientfactory.createClam();
	}

}
