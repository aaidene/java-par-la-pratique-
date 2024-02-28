package fr.greta.heritage.metier;

import java.util.ArrayList;
import java.util.List;

public class Personnel {
   
    protected List<Employe> employes;
    protected static int nbreEmploye;
    protected static final int MAXEMPLOYE = 100;

    public Personnel() {
        this.employes = new ArrayList<Employe>();
    }

    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    public double SalaireMoyen() {
        double sommeSalaires = 0;
        for (Employe employe : employes) {
            sommeSalaires += employe.calculerSalaire();
        }
        return sommeSalaires / employes.size();
    }

    public void afficherSalaires() {
        for (Employe employe : employes) {
            System.out.println(" Le " + employe.getClass().getSimpleName()+ " " + employe.nom + " gagne: " + employe.calculerSalaire() + " euros.");
        }
    }
}