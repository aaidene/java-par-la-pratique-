package fr.greta.poo.metier;

import java.util.Date;

public abstract class Employe {

	protected String nom;
	protected String prenom;
	protected Byte age;
	protected Date dateEntree;
	
	protected Employe(String nom, String prenom, Byte age, Date dateEntree) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.dateEntree = dateEntree;
	}
	
	public abstract Float calculerSalaire();

	public String getInfosEmploye() {
		return "Employe [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", dateEntree=" + dateEntree + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Byte getAge() {
		return age;
	}

	public void setAge(Byte age) {
		this.age = age;
	}

	public Date getDateEntree() {
		return dateEntree;
	}
	
}
