package fr.greta.poo.metier;

import java.util.Date;

public class Vendeur extends Commercial implements ISalaire {

	public Vendeur(String nom, String prenom, Byte age, Date dateEntree) {
		super(nom, prenom, age, dateEntree);
	}

	@Override
	public Float calculerSalaire() {
		return (chiffreDaffaires * .20f) + PRIME_VENTE;
	}

}
