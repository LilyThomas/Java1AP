/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.anneliesthomas;

import java.time.LocalDate;

/**
 *
 * @author lily
 */
public class Passagier {
    public String naam;
    public String voornaam;
    public String rijksregisternr;
    public LocalDate geboortedatum;
    
    public Passagier(String naam, String voornaam, String rijksregisternr, LocalDate geboortedatum){
        this.naam = naam;
        this.voornaam = voornaam;
        this.rijksregisternr = rijksregisternr;
        this.geboortedatum = geboortedatum;
    }
    
    public Passagier(String naam, String voornaam, String rijksregisternr){
        this(naam, voornaam, rijksregisternr, null);
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
     * @return the rijksregisternr
     */
    public String getRijksregisternr() {
        return rijksregisternr;
    }

    /**
     * @return the geboortedatum
     */
    public LocalDate getGeboortedatum() {
        return geboortedatum;
    }

    /**
     * @param geboortedatum the geboortedatum to set
     */
    public void setGeboortedatum(LocalDate geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    @Override
    public String toString() {
        return "Passagier{" + "naam=" + naam + ", voornaam=" + voornaam + ", rijksregisternr=" + rijksregisternr + ", geboortedatum=" + geboortedatum + '}';
    }
    
    
    
    
}
