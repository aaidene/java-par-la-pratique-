package com.greta.service;
import java.util.List;

import com.greta.LaBoutique.Model.Produit;

public interface ProduitService {

	Produit saveProduit(Produit produit);

    List<Produit> getAllProduits();

    Produit getProduitById(Integer id);

    String deleteProduit(Integer id);

    Produit editProduit(Produit produit, Integer id);
}
