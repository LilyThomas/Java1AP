/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.anneliesthomas.introoef3;

import java.util.ArrayList;

/**
 *
 * @author lily
 */
public class TVZender {
    public String naam;
    public ArrayList<TVProgramma> programmas;
    
    public TVZender(String naam){
        this.naam = naam;
        this.programmas = new ArrayList<TVProgramma>();
    }

    /**
     * @return the naam
     */
    public String getNaam() {
        return naam;
    }

    /**
     * @return the programmas
     */
    public ArrayList<TVProgramma> getProgrammas() {
        return programmas;
    }
    
    public void addProgram(TVProgramma programma){
        programmas.add(programma);
    }

    @Override
    public String toString() {
        return "TVZender{" + "naam=" + naam + ", programmas=" + programmas + '}';
    }
    
    
}
