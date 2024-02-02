package fr.gretta.comptes.metier;

import java.util.ArrayList;
import java.util.List;

import fr.gretta.comptes.entity.Client;
import fr.gretta.comptes.entity.Compte;

public class CompteMetier {

	public void bouclerComptes() {
		for (Client client : ClientMetier.getClients()) {
			for (Compte compte : client.getComptes()) {
				compte.setSolde(compte.getSolde() * (1 + compte.getTaux()));
			}
		}
	}

	public void afficherSoldes() {
		for (Client client : ClientMetier.getClients()) {
			System.out.println("Client : " + client.getNom() + " " + client.getPrenom());
			for (Compte compte : client.getComptes()) {
				System.out.print("  -> compte : " + compte.getType());
				System.out.printf(" => solde = %.2f euros", compte.getSolde());
				System.out.println();
			}
		}
	}
	public List<Compte> getComptesDebiteurs() {
        List<Compte> comptesDebiteurs = new ArrayList<>();
        for (Client client : ClientMetier.getClients()) {
            for (Compte compte : client.getComptes()) {
                if (compte.getSolde() < 0) {
                    comptesDebiteurs.add(compte);
                }
            }
        }
        return comptesDebiteurs;
    }

}
