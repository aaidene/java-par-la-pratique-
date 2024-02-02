package fr.gretta.tp3.entity;

import java.time.Year;

public final class Voiture extends Vehicule {
	
	private double cylindree;
	private int nbPorte;
	private double puissance;
	private double kilometrage;
	
		



	public Voiture(String marque, int anneeDachat, float prixDachat, float prixCourant, double cylindree, int nbPorte,
			double puissance, double kilometrage) {
		super(marque, anneeDachat, prixDachat, prixCourant);
		this.cylindree = cylindree;
		this.nbPorte = nbPorte;
		this.puissance = puissance;
		this.kilometrage = kilometrage;
	}



	public double getCylindree() {
		return cylindree;
	}



	public void setCylindree(double cylindree) {
		this.cylindree = cylindree;
	}



	public int getNbPorte() {
		return nbPorte;
	}



	public void setNbPorte(int nbPorte) {
		this.nbPorte = nbPorte;
	}



	public double getPuissance() {
		return puissance;
	}



	public void setPuissance(double puissance) {
		this.puissance = puissance;
	}



	public double getKilometrage() {
		return kilometrage;
	}



	public void setKilometrage(double kilometrage) {
		this.kilometrage = kilometrage;
	}



	@Override
	public void afficher() {
	    System.out.println("------ Voiture " + getMarque());
	    super.afficher();
	    System.out.println("Cylindre: " + getCylindree() + ", Nombre de portes: " + getNbPorte() +
	            ", Puissance: " + getPuissance() + ", Kilométrage: " + getKilometrage());
	}


	   @Override
	    public void calculerPrix() {
		 
		 int anneeActuelle = Year.now().getValue();
	        double decote = (anneeActuelle-this.anneeDachat) * 0.02;
	        decote = decote + (this.kilometrage / 10000) * 0.05;

	        if ("FIAT".equals(this.marque) || "RENAULT".equals(this.marque)) {
	            decote = decote + 0.1;
	        } else if ("FERRARI".equals(this.marque) || "PORSCHE".equals(this.marque)) {
	            decote = decote - 0.2;
	        }

	        prixCourant = (float) ((1.0 - decote) * this.prixDachat);

	        if (prixCourant < 0) {
	            prixCourant = 0;
	        }

	       
	    }





}
