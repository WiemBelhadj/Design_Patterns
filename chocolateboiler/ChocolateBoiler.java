package tn.enis.chocolateboiler;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler uniqueInstance = new ChocolateBoiler();

	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}

	public static ChocolateBoiler getInstance() {

		return uniqueInstance;
	}

	public void fill() {
		if (empty) {
			// remplir la casserole avec du lait/chocolat
			empty = false;
			boiled = false;
		}
	}

	public void boil() {
		if (!empty && !boiled) {
			// faire bouillir
			boiled = true;
		}
	}

	public void drain() {
		if (!empty && boiled) {
			// vider la casserole
			empty = true;
		}
	}
}