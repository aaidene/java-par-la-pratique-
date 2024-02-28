package com.greta.LaBoutique.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.greta.LaBoutique.Model.Produit;
import com.greta.service.ProduitService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ProduitController {

    @Autowired
    private ProduitService produitService;

    @PostMapping("/saveProduit")
    public ResponseEntity<Produit> saveProduit(@RequestBody Produit produit) {
        Produit savedProduit = produitService.saveProduit(produit);
        return new ResponseEntity<>(savedProduit, HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<Produit>> getAllProduits() {
        List<Produit> produits = produitService.getAllProduits();
        return new ResponseEntity<>(produits, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produit> getProduitById(@PathVariable Integer id) {
        Produit produit = produitService.getProduitById(id);
        if (produit != null) {
            return new ResponseEntity<>(produit, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/deleteProduit/{id}")
    public ResponseEntity<String> deleteProduit(@PathVariable Integer id) {
        String result = produitService.deleteProduit(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }


    @PostMapping("/editProduit/{id}")
    public ResponseEntity<Produit> editProduit(@RequestBody Produit produit, @PathVariable Integer id) {
        Produit updatedProduit = produitService.editProduit(produit, id);
        if (updatedProduit != null) {
            return new ResponseEntity<>(updatedProduit, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
