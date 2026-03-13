package com.example.demo.MouvementStock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MouvementStockController{
    private final MouvementStockService mouvementStockService;
    @Autowired
    public MouvementStockController(MouvementStockService mouvementStockService) {
        this.mouvementStockService = mouvementStockService;
    }


}
