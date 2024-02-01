package fr.gretta.tp3.main;


import java.util.List;


import fr.gretta.tp3.entity.Client;
import fr.gretta.tp3.entity.Compte;
import fr.gretta.tp3.metier.ClientMetier;
import fr.gretta.tp3.metier.CompteMetier;

public class Application {

	public static void main(String[] args) {
		
	
		Client client1 = new Client("  hugo  ", "  victor  ");

		Compte compte1 = new Compte(1000.00,0.01f,"Compte Principal ");
		Compte compte2 = new Compte(2000.00,0.02f,"Compte d'Epargne ");
		client1.getComptes().add(compte1);
		client1.getComptes().add(compte2);
		
		//CompteMetier.addCompte(compte1);
		//CompteMetier.addCompte(compte2);
		

		ClientMetier.addClient(client1);

		Client client2 = new Client("  CAMUS  ", "  Albert  ");

		Compte compte3 = new Compte(3000.00,0.01f,"Compte Principal ");
		Compte compte4 = new Compte(4000.00,0.01f,"Compte d'Epargne ");
		client2.getComptes().add(compte3);
		client2.getComptes().add(compte4);
		
		ClientMetier.addClient(client2);

		List<Client> clients = ClientMetier.getClient();
		
		
		System.out.println("solde actuel des comptes avant le bouclage");
		CompteMetier.afficherSoldes(clients);
		System.out.println("==================================");
		System.out.println("bouclage de tous les comptes ");
	    CompteMetier.bouclerComptes(clients);
	     
		System.out.println("==================================");
	    System.out.println("solde actuel des comptes Aprés le bouclage");
	    CompteMetier.afficherSoldes(clients);
	     
	  
		// en utilisant les index : (depuis java 4)
	
		// en utilisant les index : (depuis java 4)
		

		//List<Client> clients = ClientMetier.getClients();

		
		/*
		Client client1 = new Client("HUGO","Victor",1000.00,0.01f,2000.00,0.02f);
		Client client2 = new Client("CAMUS","Albert",3000.00,0.01f,4000.00,0.02f);

		
		System.out.println("solde actuel des comptes avant le bouclage");
		client1.afficherSoldes();
		client2.afficherSoldes();
		

		System.out.println("bouclage de tous les comptes");
		client1.bouclerComptes();
		client2.bouclerComptes();
		
		

		System.out.println("solde actuel des comptes avant le bouclage");
		client1.afficherSoldes();
		client2.afficherSoldes();
		*/

	}

}
