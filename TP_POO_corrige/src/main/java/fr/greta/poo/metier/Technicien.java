package fr.greta.poo.metier;

import java.util.Date;

public class Technicien extends Employe implements ISalaire {

	protected Short nbUnites;

	public Technicien(String nom, String prenom, Byte age, Date dateEntree) {
		super(nom, prenom, age, dateEntree);
	}

	@Override
	public Float calculerSalaire() {
		return nbUnites * PRIX_UNITE;
	}

	@Override
	public String getInfosEmploye() {
		return "Employe [nom =" + nom + ", prenom =" + prenom + ", age =" + age + ", date d'entrée =" + dateEntree
				+ ", nombre d'unités =" + nbUnites + "]";
	}

	public Short getNbUnites() {
		return nbUnites;
	}

	public void setNbUnites(Short nbUnites) {
		this.nbUnites = nbUnites;
	}

}
