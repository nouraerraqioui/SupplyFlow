package com.example.demo.Fornisseur;

import com.example.demo.Produit.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FornisseurController {
    private final FornissuerService fornissuerService;
    @Autowired
    public FornisseurController(FornissuerService fornissuerService) {
        this.fornissuerService = fornissuerService;
    }
    @GetMapping("/Fornisseurs")
    public List<Fornisseur>  afficherFornisseurs(){
        return fornissuerService.getFornissuers();
    }
    @PostMapping("/Fornisseur")
    public void ajoueterFornisseur(@RequestBody  Fornisseur fornisseur){
        fornissuerService.addFornisseur(fornisseur);

    }



}
