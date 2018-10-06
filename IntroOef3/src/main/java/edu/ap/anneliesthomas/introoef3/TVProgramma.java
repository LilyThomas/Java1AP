/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.anneliesthomas.introoef3;

import java.time.LocalDateTime;

/**
 *
 * @author lily
 */
public class TVProgramma {
    public String naam;
    public Presentator presentator;
    public Genre genre;
    public int tijdsduur;
    public LocalDateTime uitzendtijdstip;
    
    public TVProgramma(String naam, Presentator presentator, Genre genre, int tijdsduur, LocalDateTime uitzendtijstip){
        this.naam = naam;
        this.presentator = presentator;
        this.genre = genre;
        this.tijdsduur = tijdsduur;
        this.uitzendtijdstip = uitzendtijstip;
    }

    /**
     * @return the naam
     */
    public String getNaam() {
        return naam;
    }

    /**
     * @return the presentator
     */
    public Presentator getPresentator() {
        return presentator;
    }

    /**
     * @return the tijdsduur
     */
    public int getTijdsduur() {
        return tijdsduur;
    }

    /**
     * @return the uitzendtijdstip
     */
    public LocalDateTime getUitzendtijdstip() {
        return uitzendtijdstip;
    }

    /**
     * @return the genre
     */
    public Genre getGenre() {
        return genre;
    }
    
    @Override
    public String toString() {
        return "TVProgramma{" + "naam=" + naam + ", presentator=" + presentator + ", tijdsduur=" + tijdsduur + ", uitzendtijdstip=" + uitzendtijdstip + '}';
    }
    
}
