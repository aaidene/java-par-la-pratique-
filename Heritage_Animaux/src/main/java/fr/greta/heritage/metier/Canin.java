package fr.greta.heritage.metier;


public abstract class Canin extends Animal{

	public Canin(String couleur, float poids) {
		super(couleur, poids);
		
	}

	

	@Override
	public void seDeplacer() {
		System.out.println("Je me deplace en groupe");
		
		
	}



	public void faireCalin() {
		// TODO Auto-generated method stub
		
	}
	
	

}
