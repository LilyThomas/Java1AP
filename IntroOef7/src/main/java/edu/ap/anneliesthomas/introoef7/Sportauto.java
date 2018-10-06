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
public class Sportauto extends Auto{
    public int pk;
    
    public Sportauto(Types type, Merken merk, int kmStand, int kmFactor, String chassisnummer, String nummerplaat, int pk) {
        super(type, merk, kmStand, kmFactor, chassisnummer, nummerplaat);
        this.pk = pk;
    }

    /**
     * @return the pk
     */
    public int getPk() {
        return pk;
    }

    @Override
    public String toString() {
        return super.toString() + " Sportauto{" + "pk=" + pk + '}';
    }
    
    
}
