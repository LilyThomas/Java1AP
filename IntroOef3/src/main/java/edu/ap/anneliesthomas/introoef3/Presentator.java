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
public class Presentator {
    public String naam;
    public String voornaam;
    
    public Presentator(String naam, String voornaam){
        this.naam = naam;
        this.voornaam = voornaam;
    }

    /**
     * @return the naam
     */
    public String getNaam() {
        return naam;
    }

    /**
     * @return the voornaam
     */
    public String getVoornaam() {
        return voornaam;
    }
    
    /**
     * 
     * @return the name + firstname
     */

    @Override
    public String toString() {
        return "Presentator{" + "naam=" + naam + ", voornaam=" + voornaam + '}';
    }
}
