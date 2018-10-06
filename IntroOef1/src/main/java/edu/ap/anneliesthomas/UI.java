/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.anneliesthomas;

import java.time.LocalDateTime;

/**
 *
 * @author lily
 */
public class UI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        Vlucht vlucht1 = new Vlucht(Bestemming.ROME, now);
        
        Passagier passagier1 = new Passagier("Vanneste", "Simon", "1234");
        Passagier passagier2 = new Passagier("Thomas", "Annelies", "5678");
        
        vlucht1.addPassagier(passagier1);
        vlucht1.addPassagier(passagier2);
        
        System.out.println(vlucht1.toString());
    }
    
}
