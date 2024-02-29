package fr.greta.poo.metier;

import java.util.Date;

public abstract class Commercial extends Employe {

	protected float chiffreDaffaires;

	protected Commercial(String nom, String prenom, Byte age, Date dateEntree) {
		super(nom, prenom, age, dateEntree);
	}

	@Override
	public String getInfosEmploye() {
		return "Employe [nom =" + nom + ", prenom =" + prenom + ", age =" + age
				+ ", date d'entrée =" + dateEntree + ", chiffre d'affaires =" + chiffreDaffaires + "]";
	}

	public float getChiffreDaffaires() {
		return chiffreDaffaires;
	}

	public void setChiffreDaffaires(float chiffreDaffaires) {
		this.chiffreDaffaires = chiffreDaffaires;
	}

	
}
