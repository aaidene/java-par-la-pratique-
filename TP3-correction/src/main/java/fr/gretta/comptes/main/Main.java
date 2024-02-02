package fr.gretta.comptes.main;

import fr.gretta.comptes.entity.Client;
import fr.gretta.comptes.entity.Compte;
import fr.gretta.comptes.metier.ClientMetier;
import fr.gretta.comptes.metier.CompteMetier;

public class Main {

	public static void main(String[] args) {

		Client client1 = new Client("HUGO", "Victor");
		Compte compte11 = new Compte("Principal", 0.01f, 2000f);
		Compte compte12 = new Compte("Livret A", 0.02f, -3000f);
		client1.getComptes().add(compte11);
		client1.getComptes().add(compte12);
		
		Client client2 = new Client("CAMUS", "Albert");
		Compte compte21 = new Compte("Principal", 0.03f, 4000f);
		Compte compte22 = new Compte("Livret A", 0.04f, 5000f);
		client2.getComptes().add(compte21);
		client2.getComptes().add(compte22);

		ClientMetier clientMetier = new ClientMetier();
		clientMetier.addClient(client1);
		clientMetier.addClient(client2);
		
		CompteMetier compteMetier = new CompteMetier();		
		System.out.println("Solde actuel des comptes avant bouclage :");
		compteMetier.afficherSoldes();
		System.out.println("Bouclage des comptes...");
		compteMetier.bouclerComptes();
		System.out.println("Nouveau Solde des comptes après bouclage :");
		compteMetier.afficherSoldes();
		
		System.out.println("Affichier les compte des compte debeteur :");
		 for (Compte compte : compteMetier.getComptesDebiteurs()) {
				System.out.print("  -> votre est debeteur : " + compte.getSolde());
         }
		
	
	
		
		
	}

}
