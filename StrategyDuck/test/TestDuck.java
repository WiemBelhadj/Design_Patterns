package tn.enis.test;

import java.util.ArrayList;
import java.util.List;

import tn.enis.duck.Duck;
import tn.enis.duck.MalleredDuck;
import tn.enis.duck.WoodenDuck;

public class TestDuck {

	public static void main(String[] args) {
		List<Duck> ducks = new ArrayList<>();
		ducks.add(new MalleredDuck());
		ducks.add(new WoodenDuck());

		ducks.forEach(d -> {
			d.display();
			d.performFly();
			d.performQuack();
			d.swim();
		});

	}

}
