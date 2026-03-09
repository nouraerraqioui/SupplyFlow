package com.example.demo.Produit;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProduitService {
    public List<Produit> getProduit(){
        return List.of(new Produit("bimo","food",5,20));

    }

}
