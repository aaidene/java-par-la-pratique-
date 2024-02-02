package fr.gretta.tp3.entity;

import java.time.Year;

public class Vehicule {
// protected pour ne pas créer les getter et setter 
	protected String marque;
	protected int anneeDachat;
	protected float prixDachat;
	protected float prixCourant;

	
	public Vehicule(String marque, int anneeDachat, float prixDachat, float prixCourant) {

		this.marque = marque;
		this.anneeDachat = anneeDachat;
		this.prixDachat = prixDachat;
		this.prixCourant = prixCourant;
	
	}
	
	
	
	public String getMarque() {
		return marque;
	}



	public void setMarque(String marque) {
		this.marque = marque;
	}



	public void calculerPrix() {
		int anneeActuelle = Year.now().getValue();

		double decote = (anneeActuelle - this.anneeDachat) * 0.01;

		prixCourant = (float) ((1 - decote) * (this.prixDachat));

		if (prixCourant < 0) {
			prixCourant = 0;
		}
		
	}



	
	public void afficher() {
	    System.out.println("Marque = " + this.marque + ", Année d'Achat = " + this.anneeDachat +
	            ", Prix courant = " + this.prixCourant);
	}

}
