package fr.greta.poo.metier;

import java.util.Date;

public class ManutentionnaireARisque extends Manutentionnaire implements ISalaire {

	public ManutentionnaireARisque(String nom, String prenom, Byte age, Date dateEntree) {
		super(nom, prenom, age, dateEntree);
	}

	@Override
	public Float calculerSalaire() {
		return super.calculerSalaire() + PRIME_MANUTENTIONNAIRE;
	}

}
