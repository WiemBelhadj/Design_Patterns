package tn.enis.duck;

import tn.enis.behavior.FlyWithWings;
import tn.enis.behavior.Quack;

public class MalleredDuck extends Duck {

	public MalleredDuck() {
		fbehavior = new FlyWithWings();
		qbehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("je suis un vrai canards ");
	}

}
