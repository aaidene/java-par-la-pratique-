package fr.gretta.tp3.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import fr.gretta.tp3.entity.Avion;
import fr.gretta.tp3.entity.Vehicule;
import fr.gretta.tp3.entity.Voiture;

public class Main {

    public static void main(String[] args) {
       
    	List<Vehicule> vehicules = new ArrayList<>();
        
       
        Voiture v1 = new Voiture("PEUGEOT", 2005, 5000.07f, 0.0f, 2.5f, 5, 120, 120000);
        Voiture v2 = new Voiture("PORSCHE", 1999, 250000f, 0.0f, 6.5f, 2, 280, 81300);
        Avion al = new Avion("AVION_CESSNA", 1982, 1230673.90f, 0.0f, "HELICES", 250);
        Avion a2 = new Avion("AVION_NAIN_CONNU", 1993, 4321098.00f, 0.0f, "REACTION", 1300);


        vehicules.add(v1);
        vehicules.add(v2);
        vehicules.add(al);
        vehicules.add(a2);

        for (Vehicule v : vehicules) {
            v.calculerPrix();
            v.afficher();
            System.out.println();
        }
    }
}