package tn.enis.duck;

import tn.enis.behavior.FlyNoWay;
import tn.enis.behavior.MuteQuack;

public class WoodenDuck extends Duck {

	public WoodenDuck() {
		fbehavior = new FlyNoWay();
		qbehavior = new MuteQuack();
	}

	@Override
	public void display() {
		System.out.println("je suis un Duck en bois ");
	}

}
