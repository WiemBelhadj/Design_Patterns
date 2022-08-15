package tn.enis.decorator;

import tn.enis.beverage.Beverage;

public class Whip extends CondimentDecorator {
	public Whip(Beverage beverage) {
		super("Whip", 250, beverage);
	}

}
