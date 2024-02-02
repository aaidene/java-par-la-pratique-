package fr.gretta.comptes.entity;

import java.util.ArrayList;
import java.util.List;

public class Client {

	private String nom;
	private String prenom;
	private List<Compte> comptes;
	
	public Client() {
		comptes = new ArrayList<>();
	}

	public Client(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		comptes = new ArrayList<>();
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

	public List<Compte> getComptes() {
		return comptes;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
}
