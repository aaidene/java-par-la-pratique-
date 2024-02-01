package fr.gretta.main;

import fr.gretta.tp2.entity.Personne;

public class Main1 {

	public static void main(String[] args) {

		Personne p1 = new Personne();
		p1.setNom("HUGO");
		p1.setPrenom("Victor");
		p1.setAge(65);
		
		Personne p2 = new Personne("CAMUS", "Albert", 70);
		
		System.out.println(p1);
		System.out.println(p2);
		
		if (p1.getAge() > p2.getAge()) {
			System.out.println(p1.getNom() + " est plus agé que " + p2.getNom());
		} else {
			System.out.println(p2.getNom() + " est plus agé que " + p1.getNom());
		}
	}

}
