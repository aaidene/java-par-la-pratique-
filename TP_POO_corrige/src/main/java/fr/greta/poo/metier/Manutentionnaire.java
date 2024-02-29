package fr.greta.poo.metier;

import java.util.Date;

public class Manutentionnaire extends Employe implements ISalaire {

	protected Short nbHeures;

	public Manutentionnaire(String nom, String prenom, Byte age, Date dateEntree) {
		super(nom, prenom, age, dateEntree);
	}

	@Override
	public Float calculerSalaire() {
		return nbHeures * TARIF_HORAIRE;
	}

	@Override
	public String getInfosEmploye() {
		return "Employe [nom =" + nom + ", prenom =" + prenom + ", age =" + age + ", date d'entrée =" + dateEntree
				+ ", nombre d'heures =" + nbHeures + "]";
	}

	public Short getNbHeures() {
		return nbHeures;
	}

	public void setNbHeures(Short nbHeures) {
		this.nbHeures = nbHeures;
	}




}
