package fr.greta.heritage.main;

import fr.greta.heritage.metier.Animal;
import fr.greta.heritage.metier.Lion;
import fr.greta.heritage.metier.Loup;
import fr.greta.heritage.metier.Tigre;

public class Main {

	public static void main(String[] args) {
		
		Animal loup = new Loup(" Gris blanc  ", 20);
		
		loup.boire();
		loup.manger();
		loup.seDeplacer();
		loup.crier();
		
		System.err.println("================================");

		// Création d'un lion
        Lion monLion = new Lion("Jaune", 200.0f);
        System.out.println("Caractéristiques du lion :");
        monLion.crier(); 
        monLion.seDeplacer();
        monLion.manger(); 
        System.out.println();
    	System.err.println("================================");
        // Création d'un loup
        Loup monLoup = new Loup("Gris", 30.0f);
        System.out.println("Caractéristiques du loup :");
        monLoup.crier(); 
        monLoup.seDeplacer(); 
        monLoup.manger(); 
        System.out.println();

        // Création d'un tigre
        Tigre monTigre = new Tigre("Orange", 150.0f);
        System.out.println("Caractéristiques du tigre :");
        monTigre.crier(); 
        monTigre.seDeplacer(); 
        monTigre.manger(); 
		
	}

}
