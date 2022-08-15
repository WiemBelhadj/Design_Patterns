package tn.enis.factory;

import tn.enis.ingredient.Cheese;
import tn.enis.ingredient.Clam;
import tn.enis.ingredient.CrunchyDough;
import tn.enis.ingredient.Dough;
import tn.enis.ingredient.EggPlant;
import tn.enis.ingredient.Garlic;
import tn.enis.ingredient.Mozzarella;
import tn.enis.ingredient.Onion;
import tn.enis.ingredient.Palourde;
import tn.enis.ingredient.PlumTomatoSauce;
import tn.enis.ingredient.Sauce;
import tn.enis.ingredient.Veggies;

public class TunisPizzaIngredientFactory implements PizzaIngredientFactory {
	public Dough createDough() {
		return new CrunchyDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new Mozzarella();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new EggPlant() };
		return veggies;
	}

	public Clam createClam() {
		return new Palourde();
	}
}
