package fr.greta.heritage.metier;

import java.util.Date;

public class Manutentionnaire extends Employe {
    private int heures;

    public Manutentionnaire() {
        
    }
    
   
  
    
    public Manutentionnaire(String nom, String prenom, int age, Date dateEntree) {
        super(nom, prenom, age, dateEntree);
       
    }

   
     

	public int getHeures() {
		return heures;
	}




	public void setHeures(int heures) {
		this.heures = heures;
	}




	@Override
    public double calculerSalaire() {
        return (heures * 65);
    }

   

	@Override
	public String getInfosEmploye() {
		double salaireMensuel = calculerSalaire();
		return "Vendeur [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", dateEntree=" + dateEntree
				+ ", salaireMensuel=" + salaireMensuel + "]";
	}
}