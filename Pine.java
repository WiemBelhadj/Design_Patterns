package tn.enis.decorator;

import tn.enis.beverage.Beverage;

public class Pine extends CondimentDecorator {
	public Pine(Beverage beverage) {
		super("Pine", 500, beverage);
	}

}
