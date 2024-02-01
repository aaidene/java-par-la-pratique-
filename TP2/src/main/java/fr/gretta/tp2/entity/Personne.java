package fr.gretta.tp2.entity;

import java.util.ArrayList;
import java.util.List;

public class Personne {

	private String nom;
	private String prenom;
	private int age;
	private List<Adresse> adresses;

	public Personne() {
		this.adresses = new ArrayList<Adresse>();

	}

	public Personne(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresses = new ArrayList<Adresse>();
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Adresse> getAdresses() {
		return adresses;
	}

	public void setAdresses(List<Adresse> adresses) {
		this.adresses = adresses;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", adresses=" + adresses + "]";
	}

}
