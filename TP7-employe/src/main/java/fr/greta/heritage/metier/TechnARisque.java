package fr.greta.heritage.metier;

import java.util.Date;

public class TechnARisque extends Technicien implements ISalaire {
    
	
	public TechnARisque() {
      
    }
   

	public TechnARisque(String nom, String prenom, int age, Date dateEntree) {
		super(nom, prenom, age, dateEntree);
		
	}

/*
	@Override
    public double calculerSalaire() {
        return (getUnites() * 5)+PRIME;
    }

  */
	// une autre methode
	//Avantage meme si on change la classe mere elle le prend on consédération
	@Override
    public double calculerSalaire() {
        return super.calculerSalaire()+PRIME_MANUTENTIONNAIRE;
    }

	@Override
	public String getInfosEmploye() {
		return "TechnARisque [unites=" + getUnites() + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age
				+ ", dateEntree=" + dateEntree + ", employes=" + employes + "]";
	}

     


	
}