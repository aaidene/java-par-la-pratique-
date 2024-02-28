package fr.greta.heritage.metier;

/**
 * 
 * L'utilisation du mot-clé abstract signifie que cette classe ne peut pas être instanciée directement ; 
 * elle sert plutôt de modèle pour d'autres classes qui en héritent. En d'autres termes, elle est conçue pour
 *  être étendue par des sous-classes 
 * qui fournissent des implémentations spécifiques de ses méthodes abstraites ou qui peuvent ajouter des fonctionnalités supplémentaires.
 */
//

/**
 * Constructeur de la classe Animal.
 * 
 * @param couleur La couleur de l'animal
 * @param poids Le poids de l'animal
 */
public abstract class Animal {
	
	// protected pour ne pas mettre des guetter et setter 
	protected String couleur ;
	protected  float poids;
	public Animal(String couleur, float poids) {
		
		this.couleur = couleur;
		this.poids = poids;
	}
	
	public void  manger () {
		
		System.out.println("Je mange de la via,de");
	}
	
	
	// Concret mais les class filles peuvent implementet les methode 
  public void  boire () {
		
		System.out.println("Je bois de l 'eau ");
	}
	

public abstract void crier();
public abstract void seDeplacer();

public void faireCalin() {
	// TODO Auto-generated method stub
	
}

}
