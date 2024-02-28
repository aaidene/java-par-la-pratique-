package fr.greta.heritage.metier;

import java.util.Date;

public abstract class Commercial extends Employe {

	protected double chiffreAffaire;

	protected Commercial() {
		super();
	}

	public double getChiffreAffaire() {
		return chiffreAffaire;
	}

	public void setChiffreAffaire(double chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}

	protected Commercial(String nom, String prenom, int age, Date dateEntree) {
		super(nom, prenom, age, dateEntree);
	}

	public abstract String getInfosEmploye();

}
