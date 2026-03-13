package com.example.demo.MouvementStock;

import com.example.demo.Produit.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MouvementStockRepository extends JpaRepository<MouvementStock, Integer> {
}
