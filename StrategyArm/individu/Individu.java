package tn.enis.individu;

import tn.enis.aventure.ComportementArme;

public abstract class Individu {

	protected ComportementArme arme;

	public abstract void combattre();

	public abstract void display();

	public void setArme(ComportementArme arme) {
		this.arme = arme;
	}

	public void utiliserArme() {
		arme.utiliserArme();
	}

}
