package com.example.demo.Produit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/Produit")
public class ProduitController {
    private final ProduitService produitService;
    @Autowired
    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }
}
