package tn.enis.decorator;

import tn.enis.beverage.Beverage;

public class Milk extends CondimentDecorator {
	public Milk(Beverage beverage) {

		super("Milk", 250, beverage);
	}

}
