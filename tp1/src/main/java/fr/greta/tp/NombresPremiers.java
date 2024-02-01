package fr.greta.tp;

public class NombresPremiers {
   
	
	public static void main(String[] args) {
      
        int compteur = 1; // Le nombre max de nombres premiers à afficher
        
        for (int i = 2; compteur <= 10; i++) {
            boolean isPremier = true;
            for (int j = 2; j <= i/2 ; j++) {
                if ((i%j) == 0) {
                    isPremier = false;
                    break;
                }
            }
            if (isPremier) {
                System.out.print(i + " ");
                compteur++;
            }
        }
	}
}
  