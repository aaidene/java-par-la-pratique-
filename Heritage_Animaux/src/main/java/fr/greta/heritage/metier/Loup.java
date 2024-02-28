package fr.greta.heritage.metier;

public class Loup extends Felin {

	public Loup(String couleur, float poids) {
		super(couleur, poids);
		
	}

	@Override
	public void crier() {
		System.out.println("Je hurle dans les montagne");
		
	}

}
