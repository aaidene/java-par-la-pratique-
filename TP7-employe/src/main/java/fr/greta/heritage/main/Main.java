package fr.greta.heritage.main;

import fr.doranco.hibernate.utils.Dates;
import fr.greta.heritage.metier.ManutARisque;
import fr.greta.heritage.metier.Manutentionnaire;
import fr.greta.heritage.metier.Personnel;
import fr.greta.heritage.metier.Representant;
import fr.greta.heritage.metier.TechnARisque;
import fr.greta.heritage.metier.Technicien;
import fr.greta.heritage.metier.Vendeur;


public class Main {

	public static void main(String[] args) {

	      	
	    Personnel p = new Personnel();
          
		Vendeur v = new Vendeur("CAMUS", "Albert", 45, Dates.convertStringToDate("23/11/2012"));
	     v.setChiffreAffaire(10000.0f);	
		p.ajouterEmploye(v);
		
		Technicien t = new Technicien("HUGO", "Victor", 52, Dates.convertStringToDate("19/04/2008"));
		t.setUnites(35);
		p.ajouterEmploye(t);
		
	    //p.ajouterEmploye(new Vendeur("Pierre", "Business", 45, 1995, 30800));
	    p.ajouterEmploye(new Vendeur("Daouda", "teste", 45, Dates.convertStringToDate("12/02/2010")));
	    p.ajouterEmploye(new Representant("nora", "Business", 25, Dates.convertStringToDate("12/02/2010")));
	    
	    
	 
	   Technicien tech = new Technicien("john", "Business", 21, Dates.convertStringToDate("12/02/2010"));
	   
	   tech.setUnites(23);

	    p.ajouterEmploye(tech);

	    p.ajouterEmploye(new TechnARisque("yamina", "Business", 34, Dates.convertStringToDate("12/02/2010")));
	    
	    
	    p.ajouterEmploye(new Manutentionnaire("huguette", "Business", 25, Dates.convertStringToDate("12/02/2010")));
	    p.ajouterEmploye(new ManutARisque("yamina", "Business", 25, Dates.convertStringToDate("12/02/2010")));
	    
	
	
	    
	    //p.ajouterEmploye(new Technicien("Yves", "Bosseur", 32, 2015, 23));
	    
	    //p.ajouterEmploye(new Manutentionnaire("Jeanne", "Stocketout", 32, 1998, 45));
	    
	    //p.ajouterEmploye(new TechnicienARisque("Jean", "Flippe", 28, 2002, 1800));
	    
	   // p.ajouterEmploye(new ManutentionnaireARisque("Karin", "Abordage", 30, 2021, 2200));
	    
	   
	    p.afficherSalaires();

	
	 
	    System.out.println("--------------------------------------------------");
        
	    System.out.println("Le salaire moyen dans l'entreprise est de " + p.SalaireMoyen() + " euros.");
	  
	    System.out.println("---------Techniciens------------- ");
	    
	    
	}
}