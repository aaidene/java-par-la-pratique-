package fr.greta.heritage.metier;

public class Chien extends Canin implements IRintintin {

	public void Chien() {
	}
	
	
	public Chien(String couleur, float poids) {
		super(couleur, poids);
		
	}

	@Override
	public void crier() {
	System.err.println("j'aboie dans le jardin");
		
	}

	@Override
	public void faireCalin() {
		
		System.err.println("J'aime bien faire les calin");
	
		
	}


    @Override
    public void faireLechouille() {
        System.out.println("Je fais de grosses léchouilles.");
    }

    @Override
    public void faireLebeau() {
        System.out.println("Je fais le beau.");
    }

	
	
}
