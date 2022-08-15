package tn.enis.duck;

import tn.enis.behavior.FlyBehavior;
import tn.enis.behavior.QuackBehavior;

public abstract class Duck {

	protected QuackBehavior qbehavior;
	protected FlyBehavior fbehavior;

	public abstract void display();

	public void swim() {
		System.out.println("je peux nager !");
	}

	public void setFlyBehavior(FlyBehavior fbehavior) {
		this.fbehavior = fbehavior;
	}

	public void setQuackBehavior(QuackBehavior qbehavior) {
		this.qbehavior = qbehavior;
	}

	public void performQuack() {
		qbehavior.quack();
	}

	public void performFly() {
		 fbehavior.fly();
	}

}
