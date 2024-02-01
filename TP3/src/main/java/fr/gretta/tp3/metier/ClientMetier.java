package fr.gretta.tp3.metier;


import java.util.ArrayList;
import java.util.List;


import fr.gretta.tp3.entity.Client;
import fr.gretta.tp3.entity.Compte;




public class ClientMetier {
	
	private static List<Client> clients = new ArrayList<Client>();
	

	private ClientMetier() {
	}
	
	public static void addClient(Client client) {
	    client.setNom(client.getNom().trim().toUpperCase());
	    client.setPrenom(client.getPrenom().trim().substring(0, 1).toUpperCase()
	            .concat(client.getPrenom().trim().substring(1).toLowerCase()));

	    clients.add(client);
	}
	

   
	
		public static List<Client> getClient() {
			return clients;
		}
	
	
	
}
