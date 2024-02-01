package fr.gretta.tp3.entity;

import java.util.ArrayList;
import java.util.List;



public class Client {
	
	private String nom;
    private String prenom;
    private List<Compte> comptes;
    
    

	public Client() {
		 this.comptes = new ArrayList<Compte>();
       
    }

	public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.comptes = new ArrayList<Compte>();
       
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



	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}



	public Client(String nom, String prenom, List<Compte> comptes) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.comptes = comptes;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", comptes=" + comptes + "]";
	}




    

}
