
package fr.greta.tp;

public class Factorielle {
    public static void main(String[] args) {


    	final int N = 20; 
    	 int i = 1;
    	while (i <= N) {
            long factorielle = calculeFactorial(i);
            System.out.println(i + "! = " + factorielle);
            i++;
        }
    	
    	
    }
    
   

    public static long calculeFactorial(int f) {
    	  int result = 1;
    	  
    	  for (int i = 1; i <= f; i++) {
    	     result = result * i; 
    	  }
    	  return result;
    	}
   
}
