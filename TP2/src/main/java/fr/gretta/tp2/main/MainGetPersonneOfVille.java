package fr.gretta.tp2.main;

import java.util.List;

import fr.gretta.tp2.entity.Adresse;
import fr.gretta.tp2.entity.Personne;
import fr.gretta.tp2.metier.PersonneMetier;

public class MainGetPersonneOfVille {

	public static void main(String[] args) {

		Personne p1 = new Personne("nom1", "prenom1", 70);

		Adresse a1 = new Adresse("5", "rue de bastille", "Lille", "75000");
		Adresse a2 = new Adresse("10", "avenue des Champs-Élysées", "lyon", "75001");

		p1.getAdresses().add(a1);
		p1.getAdresses().add(a2);



		// Création de la deuxième personne
		Personne p2 = new Personne("nom2", "prenom2", 45);

		Adresse a3 = new Adresse("3", "rue du Louvre", "Paris", "75002");
		Adresse a4 = new Adresse("20", "rue de Rivoli", "Paris", "75003");

		p2.getAdresses().add(a3);
		p2.getAdresses().add(a4);

		PersonneMetier.addPersonne(p1);
		PersonneMetier.addPersonne(p2);

		// Afficher les nom et prenom qui habite la ville de paris
		// apperler la methode getPesonneOfVille
		 // Afficher les noms et prénoms des personnes qui habitent la ville de Paris
		
		List<Personne> personnes = PersonneMetier.getPersonneOfVille("Paris");
        
		for (Personne p : personnes) {
			System.out.println(p);
			
		}
		
		
	
		
	}

}