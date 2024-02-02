package fr.gretta.ecole.main;

import fr.gretta.ecole.entity.Enseignant;
import fr.gretta.ecole.entity.Etudiant;

public class Main {

	public static void main(String[] args) {
		
		Etudiant etudiant = new Etudiant("HUGO", "Victor", (byte)70, "informatique", "GRETTA");

		etudiant.afficherInfos();
		
		System.out.println("=======================================");
		
		Enseignant enseignant = new Enseignant("CAMUS", "Albert", (byte)65);
		enseignant.getModules().add("Maths");
		enseignant.getModules().add("Physique");
		enseignant.getFilieres().add("Informatique");
		enseignant.getFilieres().add("Sciences Techniques");
		enseignant.getFilieres().add("Ingénieur");
		
		enseignant.afficherInfos();
	}

}
