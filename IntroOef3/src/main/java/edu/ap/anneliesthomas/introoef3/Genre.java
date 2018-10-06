/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.anneliesthomas.introoef3;

/**
 *
 * @author lily
 */
public enum Genre {
    ACTIE("Act", "PewPewPew"),
    THRILLER("Thr", "AAAAHHHH"),
    ROMANTIEK("Rom", "OOOOH"),
    KOMEDIE("Kom","HaHaHaHa");
    
    public String afkorting;
    public String beschrijving;
    
    private Genre(String afkorting, String beschrijving){
        this.afkorting = afkorting;
        this.beschrijving = beschrijving;
    }

    /**
     * @return the afkorting
     */
    public String getAfkorting() {
        return afkorting;
    }

    /**
     * @return the beschrijving
     */
    public String getBeschrijving() {
        return beschrijving;
    }

    /**
     * 
     * @return afkorting + beschrijving
     */
    @Override
    public String toString() {
        return "Genre{" + "afkorting=" + afkorting + ", beschrijving=" + beschrijving + '}';
    }
    
    
}
