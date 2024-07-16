package com.github.IliyaBarbarossa.prikaz.servises;

import com.github.IliyaBarbarossa.prikaz.model.Prikaz;
import com.github.IliyaBarbarossa.prikaz.repositories.PRep;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class PServ {
    private PRep pRep;

    public PServ(PRep pRep) {
        this.pRep = pRep;
    }

    public Prikaz newPrikaz(int nomber){
        Prikaz prikaz = new Prikaz();
        prikaz.setNomber(nomber);
        return pRep.save(prikaz);
    }
    public Prikaz getPrikaz(int id){
        return pRep.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public Prikaz updatePrikaz(int id, int nomber){
        Prikaz prikaz = new Prikaz();
        prikaz.setId(id);
        prikaz.setNomber(nomber);
        return pRep.save(prikaz);
    }
}
