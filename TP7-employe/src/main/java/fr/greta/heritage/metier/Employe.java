package fr.greta.heritage.metier;

import java.util.Date;

public abstract class Employe extends Personnel {

	protected String nom;
	protected String prenom;
	protected int age;
	protected Date dateEntree;

	protected Employe() {

	}

	protected Employe(String nom, String prenom, int age, Date dateEntree) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.dateEntree = dateEntree;
	}

	public abstract double calculerSalaire();

	public abstract String getInfosEmploye();
}
