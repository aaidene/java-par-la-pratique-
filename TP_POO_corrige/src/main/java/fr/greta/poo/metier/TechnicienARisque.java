package fr.greta.poo.metier;

import java.util.Date;

public class TechnicienARisque extends Technicien implements ISalaire {

	public TechnicienARisque(String nom, String prenom, Byte age, Date dateEntree) {
		super(nom, prenom, age, dateEntree);
	}

	@Override
	public Float calculerSalaire() {
		return super.calculerSalaire() + PRIME_TECHNICIEN;
	}

}
