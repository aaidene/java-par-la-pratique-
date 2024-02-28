package fr.greta.heritage.metier;

import java.util.Date;

public  class Technicien extends Employe {
   
	private int unites;

    public Technicien() {
        
    }
    
    
    public Technicien(String nom, String prenom, int age, Date dateEntree) {
		super(nom, prenom, age, dateEntree);

	}
    
    
    

    public int getUnites() {
        return unites;
    }

    public void setUnites(int unites) {
        this.unites = unites;
    }


	@Override
    public double calculerSalaire() {
        return unites * 5;
    }

  

	@Override
	public String getInfosEmploye() {
		return "TechnARisque [unites=" + unites + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age
				+ ", dateEntree=" + dateEntree + ", employes=" + employes + "]";
	}

}
