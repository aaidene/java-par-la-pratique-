package fr.greta.heritage.metier;

public class Lion extends Felin{

	public Lion(String couleur, float poids) {
		super(couleur, poids);
		
	}

	@Override
	public void crier() {
		System.out.println("je rugit dans la savane");
		
	}

}
