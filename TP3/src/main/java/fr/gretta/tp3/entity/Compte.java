package fr.gretta.tp3.entity;

public class Compte {
	
	private double taux; 
    private double solde;
    private String type;


 
    public Compte(double solde, double taux) {
		super();
		this.taux = taux;
		this.solde = solde;
		
		
	}
    
    

    public Compte(double solde,double taux, String type) {
		super();
		this.taux = taux;
		this.solde = solde;
		this.type = type;
	}


	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public void boucler() {
        double interets = solde * (taux / 100); 
        solde += interets; 
    }

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte [taux=" + taux + ", solde=" + solde + "]";
	}
	
	

}
