package com.example.demo.MouvementStock;

import jakarta.persistence.*;

@Entity
@Table
public class MouvementStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    String type;
    private int quantite;

    public MouvementStock(String type, int quantite) {
        this.type = type;
        this.quantite = quantite;
    }

    public MouvementStock() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
