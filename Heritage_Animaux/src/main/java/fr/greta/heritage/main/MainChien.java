package fr.greta.heritage.main;

import fr.greta.heritage.metier.Chien;
import fr.greta.heritage.metier.IRintintin;

public class MainChien {

    public static void main(String[] args) {

        Chien c=new Chien("Gris bleuté",20);
        c.boire();
        c.manger();
        c.seDeplacer();
        c.crier();
        System.out.println(c.toString());

        System.out.println("--------------------------------------");
        c.faireCalin();
        c.faireLebeau();
        c.faireLechouille();

        System.out.println("------------------------------------------------");

        IRintintin r = new Chien(null, 0);
        r.faireLebeau();
        r.faireCalin();
        r.faireLechouille();

    }

}