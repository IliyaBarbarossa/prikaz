package com.github.IliyaBarbarossa.prikaz.controller;

import com.github.IliyaBarbarossa.prikaz.mapToResp.PMapToResp;
import com.github.IliyaBarbarossa.prikaz.model.Prikaz;
import com.github.IliyaBarbarossa.prikaz.responces.PResp;
import com.github.IliyaBarbarossa.prikaz.servises.ClServ;
import com.github.IliyaBarbarossa.prikaz.servises.PServ;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prikaz")
public class
pController {
    private PServ pServ;
    private PMapToResp pMapToResp;
    private ClServ clServ;


    public pController(PServ pServ, PMapToResp pMapToResp, ClServ clServ) {
        this.pServ = pServ;
        this.pMapToResp = pMapToResp;
        this.clServ = clServ;
    }

    @PutMapping
    public PResp newPResp(String token, int nomber) throws Exception {
        int permition = 1;
        boolean dostup = clServ.dostup(token, permition);
        if (dostup == true) {
            return pMapToResp.mapToResp(pServ.newPrikaz(nomber));
        } else {

            Exception e = new Exception("folse");
            throw e;
        }

    }

    @PatchMapping
    public PResp updatePresp(String token, int id, int nomber) throws Exception {
        int permition = 1;
        boolean dostup = clServ.dostup(token, permition);
        if (dostup == true) {
            return pMapToResp.mapToResp(pServ.newPrikaz(nomber));
        } else {

            Exception e = new Exception("folse");
            throw e;
        }
    }
}
