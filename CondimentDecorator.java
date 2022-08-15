package tn.enis.decorator;

import tn.enis.beverage.Beverage;

public class CondimentDecorator {
	protected Beverage beverage;

	public CondimentDecorator(String description, float price, Beverage beverage) {
		super(description, price);
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + " with " + description;
	}

	public float price() {
		return price + beverage.cost();
	}

}
