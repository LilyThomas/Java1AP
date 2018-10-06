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
public class NietAlcoholischeDrank extends Drank{
    public boolean bevatPrik;
    
    public NietAlcoholischeDrank(BigDecimal prijs, String naam, boolean bevatPrik) {
        super(prijs, naam);
        this.bevatPrik = bevatPrik;
    }

    /**
     * @return the bevatPrik
     */
    public boolean isBevatPrik() {
        return bevatPrik;
    }

    @Override
    public String toString() {
        return super.toString() + " NietAlcoholischeDrank{" + "bevatPrik=" + bevatPrik + '}';
    }
    
}
