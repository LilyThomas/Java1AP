/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.anneliesthomas.introoef4;

import java.math.BigDecimal;

/**
 *
 * @author lily
 */
public abstract class Drank {
    public BigDecimal prijs;
    public String naam;
    
    public Drank(BigDecimal prijs, String naam){
        this.prijs = prijs;
        this.naam = naam;
    }

    /**
     * @return the prijs
     */
    public BigDecimal getPrijs() {
        return prijs;
    }

    /**
     * @return the naam
     */
    public String getNaam() {
        return naam;
    }
    
    public boolean equals(Drank drank){
        if(drank == null){
            throw new IllegalArgumentException("drank is null");
        } else if(this.getNaam().equalsIgnoreCase(drank.getNaam())){
            return true;
        } else{
            return false;
        }
    }

    /**
     * 
     * @return prijs + naam
     */
    @Override
    public String toString() {
        return "Drank{" + "prijs=" + prijs + ", naam=" + naam + '}';
    }
    
    
}
