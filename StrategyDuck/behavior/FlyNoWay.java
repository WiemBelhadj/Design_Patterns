package tn.enis.behavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println( "je ne peux pas voler !");
	}

}
