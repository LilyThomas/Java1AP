/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.anneliesthomas.introoef4;

import java.util.ArrayList;

/**
 *
 * @author lily
 */
public class Cafe {
    public ArrayList<Drank> dranken;
    
    public Cafe(){
        this.dranken = new ArrayList<Drank>();
    }

    /**
     * @return the dranken
     */
    public ArrayList<Drank> getDranken() {
        return dranken;
    }
    
    public void addDrank(Drank drank){
        if(drank == null){
            throw new IllegalArgumentException("Drank is null");
        } else{
            dranken.add(drank);
        }
    }
    
    public void sortOnAlcoholPercentageAndSoda(){
        ArrayList<AlcoholischeDrank> alcohols = sortOnAlcoholPercentage(dranken);
        ArrayList<NietAlcoholischeDrank> sodas = sortOnBubbles(dranken);
        ArrayList<Drank> result = new ArrayList<Drank>();
        
        for(NietAlcoholischeDrank d: sodas){
            result.add(d);
        }
        for(AlcoholischeDrank d: alcohols){
            result.add(d);
        }
        
        dranken = result;
    }
    
    public ArrayList<AlcoholischeDrank> sortOnAlcoholPercentage(ArrayList<Drank> dranken){
        ArrayList<AlcoholischeDrank> alcohols = new ArrayList<>();
        
        for(Drank d: dranken){
            if(d instanceof AlcoholischeDrank){
                alcohols.add((AlcoholischeDrank) d);
            }
        }
        for(int i = 1; i < alcohols.size(); i++){
            for(int j = i; j > 0; j--){
                if(alcohols.get(j).getAlcoholpercentage() < alcohols.get(j-1).getAlcoholpercentage()){
                   AlcoholischeDrank temp = alcohols.get(j);
                   alcohols.set(j, alcohols.get(j-1));
                   alcohols.set(j-1, temp);
                }
            }
        }
        return alcohols;
    }
    
    public ArrayList<NietAlcoholischeDrank> sortOnBubbles(ArrayList<Drank> dranken){
        ArrayList<NietAlcoholischeDrank> sodas = new ArrayList<>();
        ArrayList<NietAlcoholischeDrank> noBubbles = new ArrayList<>();
        
        for(Drank d: dranken){
            if(d instanceof NietAlcoholischeDrank){
                if(((NietAlcoholischeDrank) d).isBevatPrik()){
                    sodas.add((NietAlcoholischeDrank) d);
                } else{
                    noBubbles.add((NietAlcoholischeDrank) d);
                }
            }
        }
        
        sodas.addAll(noBubbles);
        
        return sodas;
    }

    @Override
    public String toString() {
        return "Cafe{" + "dranken=" + dranken + '}';
    }
    
    
}
