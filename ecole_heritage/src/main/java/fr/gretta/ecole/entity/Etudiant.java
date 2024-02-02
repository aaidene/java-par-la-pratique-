package fr.gretta.ecole.entity;

public final class Etudiant extends Personne {

	private String filiere;
	private String etablissement;
	
	public Etudiant(String nom, String prenom, byte age, String filiere, String etablissement) {
		super(nom, prenom, age);
		this.filiere = filiere;
		this.etablissement = etablissement;
	}

	@Override
	public void afficherInfos() {
		//super.afficherInfos();
		System.out.println("Nom : " + nom + " | Prénom : " + prenom + " | age : " + age);
		System.out.println("Filière : " + filiere + " | Etablissement : " + etablissement);
	}
	
	
}
