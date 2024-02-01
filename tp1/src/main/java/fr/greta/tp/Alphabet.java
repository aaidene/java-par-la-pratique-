package fr.greta.tp;

public class Alphabet {
    public static void main(String[] args) {
       
        System.out.println("Alphabet à l'endroit :");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();

    
        System.out.println("Alphabet à l'envers :");
        for (char c = 'Z'; c >= 'A'; c--) {
            System.out.print(c + " ");
        }
                     System.out.println(); 
    }	
}	
