/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.anneliesthomas;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author lily
 */
public class Vlucht {
    public Bestemming bestemming;
    public String vertrek;
    public LocalDateTime vertrektijdstip;
    public final int vluchtnr;
    private static int aantalVluchten;
    public ArrayList<Passagier> passagiers;
            
    public Vlucht(Bestemming bestemming, LocalDateTime vertrektijdstip){
        
        this.bestemming = bestemming;
        this.vertrek = "Brussel";
        this.vertrektijdstip = vertrektijdstip;
        this.vluchtnr = ++aantalVluchten;
        this.passagiers = new ArrayList<Passagier>();
    }

    /**
     * @return the bestemming
     */
    public Bestemming getBestemming() {
        return bestemming;
    }

    /**
     * @return the vertrek
     */
    public String getVertrek() {
        return vertrek;
    }

    /**
     * @return the vertrektijdstip
     */
    public LocalDateTime getVertrektijdstip() {
        return vertrektijdstip;
    }

    /**
     * @return the vluchtnr
     */
    public int getVluchtnr() {
        return vluchtnr;
    }

    /**
     * @return the passagiers
     */
    public ArrayList<Passagier> getPassagiers() {
        return passagiers;
    }
    
    public void addPassagier(Passagier passagier){
        if(passagier != null){
            passagiers.add(passagier);
        }
    }

    @Override
    public String toString() {
        return "Vlucht{" + "bestemming=" + bestemming + ", vertrek=" + vertrek + ", vertrektijdstip=" + vertrektijdstip + ", vluchtnr=" + vluchtnr + ", passagiers=" + passagiers + '}';
    }
    
    
    
    
}
