package com.github.IliyaBarbarossa.prikaz.mapToResp;

import com.github.IliyaBarbarossa.prikaz.model.Prikaz;
import com.github.IliyaBarbarossa.prikaz.responces.PResp;
import org.springframework.stereotype.Component;

@Component
public class PMapToResp {
    public PResp  mapToResp(Prikaz prikaz){
        PResp pResp = new PResp();
        pResp.setId(prikaz.getId());
        pResp.setNomber(prikaz.getNomber());
        return pResp;
    }
}
