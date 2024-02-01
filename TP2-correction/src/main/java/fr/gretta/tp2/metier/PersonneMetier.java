package fr.gretta.tp2.metier;

import java.util.ArrayList;
import java.util.List;

import fr.gretta.tp2.entity.Adresse;
import fr.gretta.tp2.entity.Personne;

public class PersonneMetier {

	private static List<Personne> personnes = new ArrayList<Personne>();

	private PersonneMetier() {
	}

	public static void addPersonne(Personne personne) {
		personne.setNom(personne.getNom().trim().toUpperCase());
		personne.setPrenom(personne.getPrenom().trim().substring(0, 1).toUpperCase()
				.concat(personne.getPrenom().trim().substring(1).toLowerCase()));
		
		personnes.add(personne);
	}

	
	
	public static List<Personne> getPersonnesOfVille(String ville) {
		List<Personne> personnesDeLaVille = new ArrayList<>();
		
		for (Personne p : personnes) {
			for (Adresse a : p.getAdresses()) {
				if(a.getVille().equalsIgnoreCase(ville)) {
					
					personnesDeLaVille.add(p);
				}
				
				
			}
			
		}
		
		
		return personnesDeLaVille;
	}
	
	public static List<Personne> getPersonnes() {
		return personnes;
	}

	
}
