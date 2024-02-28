package fr.greta.heritage.metier;


// on met la class Felin abstrat parce que il manque 
// methode crier de la classe qu'on a pas encore implementer 
public abstract class  Felin  extends Animal{

	// Il faut la classe mere lui communique des parametres des valeurs mere 
	public Felin(String couleur, float poids) {
		super(couleur, poids);
		
	}

	
     
	@Override
	public void seDeplacer() {
		
		System.out.println("Je me déplace seul ");
		
		
	}
	
	

}
