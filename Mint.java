package tn.enis.decorator;

import tn.enis.beverage.Beverage;

public class Mint extends CondimentDecorator {
	public Mint(Beverage beverage) {
		super("Mint", 250, beverage);
	}

}
