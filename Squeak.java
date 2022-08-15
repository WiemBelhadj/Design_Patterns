package tn.enis.behavior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("squeak !");
	}
}