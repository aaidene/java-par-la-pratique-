package fr.greta.heritage.metier;

import java.util.Date;

public class TechnARisque extends Technicien implements IARisque {
    
	
	public TechnARisque() {
      
    }
   

	public TechnARisque(String nom, String prenom, int age, Date dateEntree) {
		super(nom, prenom, age, dateEntree);
		
	}


	@Override
    public double calculerSalaire() {
        return (getUnites() * 5)+PRIME;
    }

  

	@Override
	public String getInfosEmploye() {
		return "TechnARisque [unites=" + getUnites() + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age
				+ ", dateEntree=" + dateEntree + ", employes=" + employes + "]";
	}

     


	
}