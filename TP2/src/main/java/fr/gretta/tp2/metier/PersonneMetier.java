package fr.gretta.tp2.metier;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import fr.gretta.tp2.entity.Adresse;
import fr.gretta.tp2.entity.Personne;

public class PersonneMetier {

	public static List<Personne> personnes = new ArrayList<Personne>();

	public PersonneMetier() {

	}

	public static List<Personne> getPersonnes() {
		return personnes;
	}

	/**
	 * 
	 * 
	 * attention pas cette methode pour une utilisé une personne utilisé plutot la
	 * methode {@link #addPersonne(Personne)}
	 * 
	 * @param personnes
	 */

	public static void setPersonnes(List<Personne> personnes) {
		PersonneMetier.personnes = personnes;
	}

	/**
	 * 
	 * cette méthode d'ajouter une personne dans la liste
	 * 
	 * @param personne
	 */

	public static void addPersonne(Personne personne) {
		// Normalisation du nom : suppression des espaces aux extrémités et mise en
		// majuscules
		personne.setNom(personne.getNom().trim().toUpperCase());

		// Normalisation du prénom :
		// 1. Suppression des espaces aux extrémités avec trim
		// 2. Convertir la première lettre en minuscule substring
		// 3. Concaténer avec le reste du prénom converti en minuscules
		personne.setPrenom(personne.getPrenom().trim().substring(0, 1).toLowerCase()
				.concat(personne.getPrenom().trim().substring(1).toLowerCase()));

		// Ajout de la personne à la liste
		personnes.add(personne);
	}

	/**
	 * methode recupere les personne qui habite dans une ville donner 
	 * @param ville 
	 * @return une liste de personne qui habite dans une ville 
	 */
	public static List<Personne> getPersonneOfVille(String ville) {
		
		List<Personne> personnesDeLaVille = new ArrayList<>();

		for (Personne personne : personnes) {

			for (Adresse adresse : personne.getAdresses()) {
				if (adresse.getVille() != ville) {

				} else {
					personnesDeLaVille.add(personne);
				}
			}
		}

		return personnesDeLaVille;
	}
	
	
	
	
	
	
	
	
}