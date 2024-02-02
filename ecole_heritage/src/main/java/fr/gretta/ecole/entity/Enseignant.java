package fr.gretta.ecole.entity;

import java.util.ArrayList;
import java.util.List;

public final class Enseignant extends Personne {

	private List<String> modules;
	private List<String> filieres;
	
	public Enseignant(String nom, String prenom, byte age) {
		super(nom, prenom, age);
		modules = new ArrayList<>();
		filieres = new ArrayList<>();
	}

	public List<String> getModules() {
		return modules;
	}

	public List<String> getFilieres() {
		return filieres;
	}
	
	@Override
	public void afficherInfos() {
		//super.afficherInfos();
		System.out.println("Nom : " + nom + " | Prénom : " + prenom + " | age : " + age);
		System.out.println("Modules enseignés :");
		modules.forEach(m -> System.out.println("  -> " + m));
		System.out.println("Filières enseignées :");
		filieres.forEach(f -> System.out.println("  -> " + f));
	}
}
