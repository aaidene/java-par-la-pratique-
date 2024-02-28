package fr.greta.heritage.metier;

import java.util.Date;

public class Vendeur extends Commercial {


	
	public Vendeur() {
		super();
	}

	public Vendeur(String nom, String prenom, int age, Date dateEntree) {
		super(nom, prenom, age, dateEntree);
	}
	
	
     
	@Override
	public double calculerSalaire() {
		return 0.2 * chiffreAffaire + 400;
	}

	@Override
	public String getInfosEmploye() {
		double salaireMensuel = calculerSalaire();
		return "Vendeur [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", dateEntree=" + dateEntree
				+ ", salaireMensuel=" + salaireMensuel + "]";
	}

}