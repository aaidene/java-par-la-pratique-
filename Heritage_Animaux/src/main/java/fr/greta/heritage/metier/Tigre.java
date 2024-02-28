package fr.greta.heritage.metier;

public class Tigre extends Felin {

	public Tigre(String couleur, float poids) {
		super(couleur, poids);
	
	}

	@Override
	public void crier() {
		System.out.println("Je grogne trés fort");
		
	}

}
