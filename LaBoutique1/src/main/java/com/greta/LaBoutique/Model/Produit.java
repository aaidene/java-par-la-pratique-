package com.greta.LaBoutique.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomProduit;
    private String description;
    private Double prix;
    private String statut;

    public Produit() {
        
    }

   
    public Produit(String nomProduit, String description, Double prix, String statut) {
        this.nomProduit = nomProduit;
        this.description = description;
        this.prix = prix;
        this.statut = statut;
    }

  

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }


	@Override
	public String toString() {
		return "Produit [id=" + id + ", nomProduit=" + nomProduit + ", description=" + description + ", prix=" + prix
				+ ", statut=" + statut + "]";
	}
    
    
    
}