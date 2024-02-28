package com.greta.LaBoutique.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greta.LaBoutique.Model.Produit;
import com.greta.LaBoutique.Repository.ProduitRepository;
import com.greta.service.ProduitService;

@Service
public class ProduitServiceImpl implements ProduitService {

    @Autowired
    private ProduitRepository produitRepo;

    @Override
    public Produit saveProduit(Produit produit) {
        return produitRepo.save(produit);
    }

    @Override
    public List<Produit> getAllProduits() {
        return produitRepo.findAll();
    }

    @Override
    public Produit getProduitById(Integer id) {
        return produitRepo.findById(id).orElse(null);
    }

    @Override
    public String deleteProduit(Integer id) {
        Produit produit = produitRepo.findById(id).orElse(null);
        if (produit != null) {
            produitRepo.delete(produit);
            return "Produit supprimé avec succès";
        }
        return "Une erreur s'est produite sur le serveur";
    }

    @Override
    public Produit editProduit(Produit nouveauProduit, Integer id) {
        Produit ancienProduit = produitRepo.findById(id).orElse(null);
        if (ancienProduit != null) {
            ancienProduit.setNomProduit(nouveauProduit.getNomProduit());
            ancienProduit.setDescription(nouveauProduit.getDescription());
            ancienProduit.setPrix(nouveauProduit.getPrix());
            ancienProduit.setStatut(nouveauProduit.getStatut());
            return produitRepo.save(ancienProduit);
        }
        return null;
    }
}
