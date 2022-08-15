package tn.enis.test;

import tn.enis.store.PizzaStore;
import tn.enis.store.SfaxStylePizzaStore;
import tn.enis.store.TunisStylePizzaStore;

public class Test {

	public static void main(String[] args) {
		PizzaStore tunisps = new TunisStylePizzaStore();
		PizzaStore sfaxps = new SfaxStylePizzaStore();
		tunisps.orderPizza("cheese");
		sfaxps.orderPizza("cheese");
	}

}
