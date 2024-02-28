package fr.greta.heritage.metier;

import java.util.Date;

public class ManutARisque extends Manutentionnaire implements IARisque {
    public ManutARisque() {
   
    }

    
    

	public ManutARisque(String nom, String prenom, int age, Date dateEntree) {
		super(nom, prenom, age, dateEntree);
	
	}




	@Override
    public double calculerSalaire() {
        return (getHeures() * 65)+PRIME;
    }

   

	@Override
	public String getInfosEmploye() {
		double salaireMensuel = calculerSalaire();
		return "Vendeur [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", dateEntree=" + dateEntree
				+ ", salaireMensuel=" + salaireMensuel + "]";
	}
    
    


}