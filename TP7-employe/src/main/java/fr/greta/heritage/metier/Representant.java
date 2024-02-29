package fr.greta.heritage.metier;

import java.util.Date;

public class Representant extends Commercial implements ISalaire {
    public Representant() {
     
    }
 
   
	public Representant(String nom, String prenom, int age, Date dateEntree) {
		super(nom, prenom, age, dateEntree);
	
	}


	@Override
    public double calculerSalaire() {
        return 0.2 * chiffreAffaire + PRIME_REPRESENTANT;
    }
	


	@Override
	public String getInfosEmploye() {
	    double salaireMensuel = calculerSalaire();
	    return "Représentant [nom=" + nom + ", prenom=" + prenom + ", age=" + age
	            + ", dateEntree=" + dateEntree + ", salaireMensuel=" + salaireMensuel + "]";
	}

    
}