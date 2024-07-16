package com.github.IliyaBarbarossa.prikaz.servises;

import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Data
@Service
public class ClServ {
    private RestClient r;

    public ClServ(RestClient r) {
        this.r = r;
    }

    public boolean dostup(String token,int permition){
        Boolean asdasdas = r.get()
                .uri("/session/token?token={token}&permition={permition}", token, permition)
                .retrieve()
                .body(Boolean.class);
        if(asdasdas==null){
            return false;
        }
        return asdasdas;
    }
}
