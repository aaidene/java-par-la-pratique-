package fr.gretta.tp3.entity;

public final class Avion extends Vehicule{
	
	private String typeMoteur;
	private int heureVol;
	
	

	public Avion(String marque, int anneeDachat, float prixDachat, float prixCourant, String typeMoteur, int heureVol) {
		super(marque, anneeDachat, prixDachat, prixCourant);
		this.typeMoteur = typeMoteur;
		this.heureVol = heureVol;
	}




	public String getTypeMoteur() {
		return typeMoteur;
	}



	public void setTypeMoteur(String typeMoteur) {
		this.typeMoteur = typeMoteur;
	}


	public int getHeureVol() {
		return heureVol;
	}



	public void setHeureVol(int heureVol) {
		this.heureVol = heureVol;
	}

	
	@Override
	public void afficher() {
	    System.out.println("-- Avion à " + getTypeMoteur());
	    super.afficher();
	    System.out.println("Nombre d'heures de vol : " + getHeureVol());
	}

	@Override
    public void calculerPrix() {
        double decote;

        if ("Hélices".equals(this.typeMoteur)) {
            decote = 0.001 * this.heureVol;
        } else {
            decote = 0.0001 * this.heureVol;
        }

        prixCourant = (float) ((1 - decote) * this.prixDachat);

        if (prixCourant < 0) {
            prixCourant = 0;
        }

       
    }
	
	
	
}
