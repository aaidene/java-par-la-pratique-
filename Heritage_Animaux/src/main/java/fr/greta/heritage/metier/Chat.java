package fr.greta.heritage.metier;

public class Chat extends Canin{

	public Chat(String couleur, float poids) {
		super(couleur, poids);
		
	}

	@Override
	public void crier() {
		System.out.println("Je miaule sur les toits");
	}

}
