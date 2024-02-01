package fr.gretta.tp3.metier;


import java.util.ArrayList;
import java.util.List;

import fr.gretta.tp3.entity.Client;
import fr.gretta.tp3.entity.Compte;

public class CompteMetier {
    
    private static List<Compte> comptes = new ArrayList<>();

    private CompteMetier() {
    }

    public static void addCompte(Compte compte) {
        comptes.add(compte);
    }

    public static void afficherSoldes(List<Client> clients) {
        for (Client client : clients) {
            System.out.println("Client : " + client.getNom() + " " + client.getPrenom());
            int compteIndex = 1;
            for (Compte compte : client.getComptes()) {
                System.out.printf(" - Solde du Compte %d (%s) : %.2f\n", compteIndex++, compte.getType(), compte.getSolde());
            }
        }
    }
    public static List<Compte> bouclerComptes(List<Client> clients) {
        List<Compte> comptesBoucles = new ArrayList<>();

        for (Client client : clients) {
            for (Compte compte : client.getComptes()) {
                compte.boucler();
                comptesBoucles.add(compte); 
            }
        }

        return comptesBoucles;
    }
    
      
    
    
    public static List<Compte> getComptes() {
        return comptes;
    }
}