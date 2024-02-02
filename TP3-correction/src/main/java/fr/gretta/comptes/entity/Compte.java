package fr.gretta.comptes.entity;

public class Compte {

	private String type;
	private float taux;
	private float solde;
	
	public Compte() {
	}

	public Compte(String type, float taux, float solde) {
		this.type = type;
		this.taux = taux;
		this.solde = solde;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getTaux() {
		return taux;
	}

	public void setTaux(float taux) {
		this.taux = taux;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte [type=" + type + ", taux=" + taux + ", solde=" + solde + "]";
	}
	
}
