package com.example.demo.Produit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProduitService {
private final ProduitRepository produitRepository;
@Autowired
public ProduitService(ProduitRepository produitRepository)
{
    this.produitRepository= produitRepository;
}
     public void addProduit(Produit produit){
      produitRepository.save(produit);
     }
    public List<Produit> getProduit(){
    return produitRepository.findAll();

    }
    public void deleteProduit(Integer id) {
        boolean exist = produitRepository.existsById(id);
        if (!exist) {
            throw new IllegalStateException("produit" + id + "n'exist pas ");
        } else {
            produitRepository.deleteById(id);
        }

    }
    public Produit updateProduit(int id,Produit produit){
     Produit p=produitRepository.findById(id).orElse(null);
    if (p!=null){
        p.setNom(produit.getNom());
        return produitRepository.save(p);
    }
    return null;
    }
}





