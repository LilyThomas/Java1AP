/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.anneliesthomas;

/**
 *
 * @author lily
 */
public enum Bestemming {
    PARIJS("Parijs"),
    KEULEN("Keulen"),
    ROME("Rome");
    
    public String beschrijving;

    private Bestemming(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    /**
     * @return the beschrijving
     */
    public String getBeschrijving() {
        return beschrijving;
    }
    
    
}
