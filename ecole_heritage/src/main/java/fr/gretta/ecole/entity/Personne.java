package fr.gretta.ecole.entity;

public class Personne {

	protected String nom;
	protected String prenom;
	protected byte age;
	
	protected Personne(String nom, String prenom, byte age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public void afficherInfos() {
		System.out.println("Nom : " + nom + " | Prénom : " + prenom + " | age : " + age);
	}
}
