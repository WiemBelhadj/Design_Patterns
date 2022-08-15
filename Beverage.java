package tn.enis.beverage;

public abstract class Beverage {

	protected float price;
	protected String description;

	public Beverage(String description, float price) {
		this.description = description;
		this.price = price;
	}

	public String getDescription() {
		return description;

	}

	public float cost() {
		return price;

	}

}
