package fr.greta.poo.metier;

import java.util.Date;

public class Representant extends Commercial implements ISalaire {

	public Representant(String nom, String prenom, Byte age, Date dateEntree) {
		super(nom, prenom, age, dateEntree);
	}

	@Override
	public Float calculerSalaire() {
		return (chiffreDaffaires * .20f) + PRIME_REPRESENTANT;
	}

}
