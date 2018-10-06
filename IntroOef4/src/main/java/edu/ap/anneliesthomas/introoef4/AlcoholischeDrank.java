/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.anneliesthomas.introoef4;

import java.math.BigDecimal;

/**
 *
 * @author lily
 */
public class AlcoholischeDrank extends Drank {

    public int alcoholpercentage;

    public AlcoholischeDrank(BigDecimal prijs, String naam, int alcoholpercentage) {
        super(prijs, naam);
        this.alcoholpercentage = alcoholpercentage;
    }

    /**
     * @return the alcoholpercentage
     */
    public int getAlcoholpercentage() {
        return alcoholpercentage;
    }

    /**
     * 
     * @return alcoholpercentage 
     */
    @Override
    public String toString() {
        return "AlcoholischeDrank{" + "alcoholpercentage=" + alcoholpercentage + '}';
    }

}
