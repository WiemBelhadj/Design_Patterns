package tn.enis.factory;

import tn.enis.ingredient.Cheese;
import tn.enis.ingredient.Clam;
import tn.enis.ingredient.Dough;
import tn.enis.ingredient.Pepperoni;
import tn.enis.ingredient.Sauce;
import tn.enis.ingredient.Veggies;

public interface PizzaIngredientFactory {
	Dough createDough();

	Sauce createSauce();

	Cheese createCheese();

	Veggies[] createVeggies();

	Clam createClam();

	Pepperoni createPepperoni();
}
