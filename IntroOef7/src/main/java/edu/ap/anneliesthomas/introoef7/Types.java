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
public enum Types {
    LIMO("Limo"),
    HATCHBACK("Hatchback"),
    CABRIO("Cabrio");
    
    public String beschrijving;
    
    private Types(String beschrijving){
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
        return "Types{" + "beschrijving=" + beschrijving + '}';
    }
    
    
}
