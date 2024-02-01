package fr.gretta.tp2.main;

import java.util.List;

import fr.gretta.tp2.entity.Adresse;
import fr.gretta.tp2.entity.Personne;
import fr.gretta.tp2.metier.PersonneMetier;

public class Main2 {

	public static void main(String[] args) {

		Personne p1 = new Personne("  hugo  ", "  victor  ", 70);
		
		Adresse a1 = new Adresse("7", "Rue de la Boétie", "Paris", "75000");
		Adresse a2 = new Adresse("8", "Avenue de la liberté", "Lyon", "69000");
		p1.getAdresses().add(a1);
		p1.getAdresses().add(a2);
		
		PersonneMetier.addPersonne(p1);

		Personne p2 = new Personne("  camus  ", "  albert  ", 65);
		
		Adresse a3 = new Adresse("5", "Passage de la gare", "Paris", "75000");
		Adresse a4 = new Adresse("9", "Bd de France", "Marseille", "13000");
		p2.getAdresses().add(a3);
		p2.getAdresses().add(a4);
		
		PersonneMetier.addPersonne(p2);
		
		List<Personne> personnes = PersonneMetier.getPersonnes();

		// en utilisant les index : (depuis java 4)
		for (int i = 0; i < personnes.size(); i++) {
			Personne p = personnes.get(i);
			System.out.println(p);
			List<Adresse> adresses = p.getAdresses();
			for (int j = 0; j < adresses.size(); j++) {
				System.out.println("   -> " + adresses.get(j));
			}
		}
		System.out.println("======================================");
		
		// en utilisant le foreach (parcours les objets) (depuis java 7)
		for (Personne p : personnes) {
			System.out.println(p);
			for (Adresse a : p.getAdresses()) {
				System.out.println("   -> " + a);
			}
		}
		System.out.println("======================================");
		
		// en utilisant les expressions lambda (depuis java 8)
		personnes.forEach(p -> {System.out.println(p);
								p.getAdresses().forEach(a -> System.out.println("   -> " + a));
								});
		
		System.out.println("======================================");
		
		// en utilisant l'API Stream (depuis java 8)
		personnes.stream().forEach(p -> {System.out.println(p);
										p.getAdresses().stream().forEach(a -> System.out.println("   -> " + a));
										});
	}

}
