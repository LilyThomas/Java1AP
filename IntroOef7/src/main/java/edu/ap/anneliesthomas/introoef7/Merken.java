/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.anneliesthomas.introoef7;

/**
 *
 * @author lily
 */
public enum Merken {
    CITROEN("Citroen"),
    TOYOTA("Toyota"),
    FORD("Ford"),
    RENAULT("Renault");
    
    public String beschrijving;
    
    private Merken(String beschrijving){
        this.beschrijving = beschrijving;
    }

    /**
     * @return the beschrijving
     */
    public String getBeschrijving() {
        return beschrijving;
    }

    @Override
    public String toString() {
        return "Merken{" + "beschrijving=" + beschrijving + '}';
    }
    
    
    
    
}
