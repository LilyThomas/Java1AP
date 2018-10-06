/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.anneliesthomas.introoef7;

import java.util.ArrayList;

/**
 *
 * @author lily
 */
public class Garage {
    public ArrayList<Auto> autos;
    
    public Garage(){
        this.autos = new ArrayList<Auto>();
    }

    /**
     * @return the autos
     */
    public ArrayList<Auto> getAutos() {
        return autos;
    }
    
    public void sortOnVolgnummer(){
        Auto temp;
        int i,j;
        for(j = 0; j < autos.size(); j++){
            for(i = 1; i < autos.size(); i++){
                if(autos.get(i-1).getVolgnummer() > autos.get(i).getVolgnummer()){
                    temp = autos.get(i);
                    autos.set(i, autos.get(i-1));
                    autos.set(i-1, temp);
                }
            }
        }
    }
    
    public void sortOnKmStand(){
        Auto temp;
        int i,j;
        for(j = 0; j < autos.size(); j++){
            for(i = 1; i < autos.size(); i++){
                if(autos.get(i-1).getKmStand()> autos.get(i).getKmStand()){
                    temp = autos.get(i);
                    autos.set(i, autos.get(i-1));
                    autos.set(i-1, temp);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Garage{" + "autos=" + autos + '}';
    }
    
    
}
