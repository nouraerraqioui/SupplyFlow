package com.example.demo.Fornisseur;

import jakarta.persistence.*;

@Entity
@Table
public class Fornisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nom;

    private String ville;

    private int telephone;

    public Fornisseur(String nom, String ville, int telephone) {
        this.nom = nom;
        this.ville = ville;
        this.telephone = telephone;
    }

    public Fornisseur() {

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
}
