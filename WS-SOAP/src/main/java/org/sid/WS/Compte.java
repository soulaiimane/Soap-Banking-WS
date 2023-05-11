package org.sid.WS;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

public class Compte {
   private int code;
    private Double solde;

    private Date datecreation;

    public Compte() {
    }

    public Compte(int code, Double solde, Date datecreation) {
        this.code = code;
        this.solde = solde;

        this.datecreation = datecreation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public Date getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(Date datecreation) {
        this.datecreation = datecreation;
    }
}
