package com.example.demo.Produit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ProduitController {
    private final ProduitService produitService;
    @Autowired
    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }
    @PostMapping("produit")
    public void addProduit(@RequestBody Produit produit){
         produitService.addProduit(produit);
    }
    @GetMapping("/produits")
    public List<Produit> getProduit(){
        return produitService.getProduit();
    }

    @DeleteMapping("produitid")
    public void deleteProduit(@PathVariable("produitid") Integer id){
        produitService.deleteProduit(id);
    }
    @PutMapping("/{id}")
    public void modifierProduit(@PathVariable int id, @RequestBody Produit produit) {
        produitService.updateProduit(id, produit);
    }
    }


