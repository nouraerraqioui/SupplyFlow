package com.example.demo.Fornisseur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Service
public class FornissuerService {
    private final FornisseurRepository fornissuerRepository;

@Autowired
    public FornissuerService(FornisseurRepository fornissuerRepository) {
        this.fornissuerRepository = fornissuerRepository;
    }

    public void addFornisseur(Fornisseur  fornisseur){
      fornissuerRepository.save(fornisseur);
}


    public List<Fornisseur> getFornissuers(){
   return  fornissuerRepository.findAll();
    }


}



