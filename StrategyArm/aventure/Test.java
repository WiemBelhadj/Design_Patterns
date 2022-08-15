package tn.enis.aventure;

import java.util.ArrayList;
import java.util.List;

import tn.enis.individu.Archer;
import tn.enis.individu.Individu;
import tn.enis.individu.Reine;

public class Test {

	public static void main(String[] args) {
		List<Individu> people = new ArrayList<>();
		people.add(new Archer());
		people.add(new Reine());

		people.forEach(i -> {
			i.display();
			i.combattre();
			i.utiliserArme();
		});
	}

}
