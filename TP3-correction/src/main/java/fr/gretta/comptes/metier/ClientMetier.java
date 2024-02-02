package fr.gretta.comptes.metier;

import java.util.ArrayList;
import java.util.List;

import fr.gretta.comptes.entity.Client;

public class ClientMetier {

	private static List<Client> clients = new ArrayList<>();
	
	public void addClient(Client client) {
		if (client == null) {
			throw new NullPointerException("Le client à créer ne doit pas être NULL !");
		}
		if (client.getNom() == null || client.getNom().trim().isEmpty()
				|| client.getPrenom() == null || client.getPrenom().trim().isEmpty()) {
			throw new IllegalArgumentException("tous les paramètres de Client sont obligatoires !");
		}
		clients.add(client);
	}

	public static List<Client> getClients() {
		return clients;
	}
	
}
