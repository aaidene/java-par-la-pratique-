package fr.gretta.tp2.entity;

public class Adresse {

	private String numero;
	private String rue;
	private String ville;
	private String codePostale;

	public Adresse() {
	}

	public Adresse(String numero, String rue, String ville, String codePostale) {
		super();
		this.numero = numero;
		this.rue = rue;
		this.ville = ville;
		this.codePostale = codePostale;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(String codePostale) {
		this.codePostale = codePostale;
	}

	@Override
	public String toString() {
		return "Adresse [numero=" + numero + ", rue=" + rue + ", ville=" + ville + ", codePostale=" + codePostale + "]";
	}

}
