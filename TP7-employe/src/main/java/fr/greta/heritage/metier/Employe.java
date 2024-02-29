package fr.greta.heritage.metier;

import java.util.Date;

public abstract class Employe extends Personnel {

	
	
	protected String nom;
	protected String prenom;
	protected int age; // byte est largement 
	protected Date dateEntree;

	protected Employe() {

	}

	protected Employe(String nom, String prenom, int age, Date dateEntree) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.dateEntree = dateEntree;
	}

	
	// on public pour pouvoir les appeler dans uml c'est #
	// on met float c'es laregment sufsant 
	public abstract double calculerSalaire();

	

    // On on ajoute pour pouvoir recupéré les informations des parametres 
	public String getInfosEmploye() {
		return "Employe [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", dateEntree=" + dateEntree + "]";
	}
	
	
	
	
	
}
