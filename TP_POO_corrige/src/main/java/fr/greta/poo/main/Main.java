package fr.greta.poo.main;

import java.util.ArrayList;
import java.util.List;

import fr.greta.poo.metier.Employe;
import fr.greta.poo.metier.Manutentionnaire;
import fr.greta.poo.metier.ManutentionnaireARisque;
import fr.greta.poo.metier.Representant;
import fr.greta.poo.metier.Technicien;
import fr.greta.poo.metier.TechnicienARisque;
import fr.greta.poo.metier.Vendeur;
import fr.greta.poo.utils.Dates;

public class Main {

	public static void main(String[] args) {

		List<Employe> personnel = new ArrayList<>();
		
		Vendeur v = new Vendeur("CAMUS", "Albert", (byte) 45, Dates.convertStringToDate("23/04/2011"));
		v.setChiffreDaffaires(10000.00f);
		personnel.add(v);

		Representant r = new Representant("HUGO", "Victor", (byte) 48, Dates.convertStringToDate("19/03/2015"));
		r.setChiffreDaffaires(8000.00f);
		personnel.add(r);
		
		Technicien t = new Technicien("DURAND", "Christophe", (byte) 45, Dates.convertStringToDate("23/04/2011"));
		t.setNbUnites((short)70);
		personnel.add(t);

		TechnicienARisque tr = new TechnicienARisque("DUPOND", "Pierre", (byte) 50, Dates.convertStringToDate("18/06/2007"));
		tr.setNbUnites((short)70);
		personnel.add(tr);

		Manutentionnaire m = new Manutentionnaire("BORLAND", "Pascal", (byte) 32, Dates.convertStringToDate("28/11/2016"));
		m.setNbHeures((short)140);
		personnel.add(m);

		ManutentionnaireARisque mr = new ManutentionnaireARisque("DECOUX", "Michel", (byte) 56, Dates.convertStringToDate("01/07/1990"));
		mr.setNbHeures((short)110);
		personnel.add(mr);

		for (Employe e : personnel) {
			System.out.println(e.getNom() + " " + e.getPrenom() + " : salaire = " + e.calculerSalaire());
		}

	}

}
