package fr.gretta.tp2.main;

import fr.gretta.tp2.entity.Personne;

public class Main {

	public static void main(String[] args) {

		Personne p1 = new Personne();
		Personne p2 = new Personne("david", "jean", 34);

		p1.setNom("aidene");
		p1.setPrenom("hakim");
		p1.setAge(40);

		System.out.println(p1.toString());
		System.out.println(p2);

	}

}