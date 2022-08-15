package tn.enis.behavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println( "je cancane pas");
	}
}