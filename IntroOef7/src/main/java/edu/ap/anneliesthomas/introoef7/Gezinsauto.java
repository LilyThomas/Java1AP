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
public class Gezinsauto extends Auto{
    public boolean trekhaak;
    public int zitplaatsen;
    
    public Gezinsauto(Types type, Merken merk, int kmStand, int kmFactor, String chassisnummer, String nummerplaat, boolean trekhaak, int zitplaatsen) {
        super(type, merk, kmStand, kmFactor, chassisnummer, nummerplaat);
        this.trekhaak = trekhaak;
        this.zitplaatsen = zitplaatsen;
    }

    /**
     * @return the trekhaak
     */
    public boolean isTrekhaak() {
        return trekhaak;
    }

    /**
     * @return the zitplaatsen
     */
    public int getZitplaatsen() {
        return zitplaatsen;
    }

    @Override
    public String toString() {
        return super.toString() + " Gezinsauto{" + "trekhaak=" + trekhaak + ", zitplaatsen=" + zitplaatsen + '}';
    }
    
    
    
}
