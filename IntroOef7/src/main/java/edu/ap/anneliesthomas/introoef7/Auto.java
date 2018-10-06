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
public abstract class Auto {
    public Types type;
    public Merken merk;
    public int kmStand;
    public int kmFactor;
    public String chassisnummer;
    public String nummerplaat;
    public final int volgnummer;
    private static int aantalAutos;
    
    public Auto(Types type, Merken merk, int kmStand, int kmFactor, String chassisnummer, String nummerplaat){
        this.volgnummer = aantalAutos++;
        this.type = type;
        this.merk = merk;
        this.kmStand = kmStand;
        this.kmFactor = kmFactor;
        this.chassisnummer = chassisnummer;
        this.nummerplaat = nummerplaat;
    }

    /**
     * @return the type
     */
    public Types getType() {
        return type;
    }

    /**
     * @return the merk
     */
    public Merken getMerk() {
        return merk;
    }

    /**
     * @return the kmStand
     */
    public int getKmStand() {
        return kmStand;
    }

    /**
     * @param kmStand the kmStand to set
     */
    public void setKmStand(int kmStand) {
        this.kmStand = kmStand;
    }

    /**
     * @return the kmFactor
     */
    public int getKmFactor() {
        return kmFactor;
    }

    /**
     * @return the chassisnummer
     */
    public String getChassisnummer() {
        return chassisnummer;
    }

    /**
     * @return the nummerplaat
     */
    public String getNummerplaat() {
        return nummerplaat;
    }

    /**
     * @param nummerplaat the nummerplaat to set
     */
    public void setNummerplaat(String nummerplaat) {
        this.nummerplaat = nummerplaat;
    }

    /**
     * @return the volgnummer
     */
    public int getVolgnummer() {
        return volgnummer;
    }
    
    public boolean equals(Auto auto){
        if(auto == null){
            throw new IllegalArgumentException("auto is null");
        } else if(this.getChassisnummer().equalsIgnoreCase(auto.getChassisnummer())){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Auto{" + "type=" + type + ", merk=" + merk + ", kmStand=" + kmStand + ", kmFactor=" + kmFactor + ", chassisnummer=" + chassisnummer + ", nummerplaat=" + nummerplaat + ", volgnummer=" + volgnummer + '}';
    }
    
    
}
