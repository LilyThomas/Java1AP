/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.anneliesthomas.recursieoef1;

/**
 *
 * @author lily
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Program program = new Program();
        
        System.out.println("Uitkomst: " + program.gcd(20, 12));
    }
    
    protected int gcd(int a, int b){
        if(b == 0){
            return a;
        } else{
            return gcd(b, a % b);
        }
    }
    
}
