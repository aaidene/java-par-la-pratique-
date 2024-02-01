package fr.gretta.main;

import fr.gretta.tp2.entity.Adresse;
import fr.gretta.tp2.entity.Personne;
import fr.gretta.tp2.metier.PersonneMetier;

public class MainGetPersonnesOfVille {

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
		
		// afficher le nom et prénom des personnes qui habitent la ville de Paris
		// appeler la méthode getPersonnesOfVille("Paris")
	}

}
