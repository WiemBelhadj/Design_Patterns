package tn.enis.factory;

import tn.enis.ingredient.Cheese;
import tn.enis.ingredient.Clam;
import tn.enis.ingredient.Clovis;
import tn.enis.ingredient.Dough;
import tn.enis.ingredient.EggPlant;
import tn.enis.ingredient.Garlic;
import tn.enis.ingredient.MarinaraSauce;
import tn.enis.ingredient.Onion;
import tn.enis.ingredient.Parmesan;
import tn.enis.ingredient.Pepperoni;
import tn.enis.ingredient.Sauce;
import tn.enis.ingredient.ThinDough;
import tn.enis.ingredient.Veggies;

public class SfaxPizzaIngredientFactory implements PizzaIngredientFactory {
	public Dough createDough() {
		return new ThinDough();
	}

	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	public Cheese createCheese() {
		return new Parmesan();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new EggPlant() };
		return veggies;
	}

	public Clam createClam() {
		return new Clovis();
	}

	public Pepperoni createPepperoni() {
		return new Pepperoni();
	}
}
