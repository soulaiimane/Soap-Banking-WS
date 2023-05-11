package org.sid.WS;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "convert")
    public Double convert(@WebParam(name = "montant") Double mt){
     return mt*10.78;
    }
    @WebMethod(operationName ="getCompte" )
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code,Math.random()*1000,new Date());
    }
    @WebMethod
    public List<Compte> compteList(){
        List<Compte> compteList=new ArrayList<>();

        return List.of(
                new Compte(1,Math.random()*1000,new Date()) ,
                    new Compte(2,Math.random()*1000,new Date()) ,
                      new Compte(3,Math.random()*1000,new Date())
                );
    }
}
