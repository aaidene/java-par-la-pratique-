package fr.greta.tp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercice23 {

	public static void main(String[] args) {

		do {
			try {

				System.out.print("Veuillez entrer une valeur : ");
				InputStreamReader isr = new InputStreamReader(System.in); // lire à partir de la console
				BufferedReader br = new BufferedReader(isr);
				String input = br.readLine();
				int max = -1;

				try {

					max = Integer.parseInt(input);
					System.out.println("1! = 1");
				} catch (NumberFormatException e) {
					System.err.println("La valeur saisie doit être un nombre entier !");
				}

				int compteur = 1; // Le nombre max de nombres premiers à afficher

				for (int i = 2; compteur < max; i++) {
					boolean isPremier = isNombrePremier(i);
					if (isPremier) {
						long fact = factoriel(i);
						compteur++;
						System.out.println(i + "! = " + fact);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (true);

	}

	public static long factoriel(int value) {

		if (value < 0) {
			throw new IllegalArgumentException("la valeur doit être >= 0 !");
		}
		if (value == 0) {
			return 1;
		}
		long fact = 1;
		for (int i = 1; i <= value; i++) {
			fact *= i; // fact = value * i;
		}
		return fact;
	}

	public static boolean isNombrePremier(int value) {

		boolean isPremier = true;
		for (int i = 2; i <= value / 2; i++) {
			if ((value % i) == 0) {
				isPremier = false;
				break;
			}
		}
		return isPremier;
	}

}