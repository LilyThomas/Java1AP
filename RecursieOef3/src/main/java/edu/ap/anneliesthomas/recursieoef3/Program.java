/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.anneliesthomas.recursieoef3;

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
        System.out.println(program.countNumbers(100));
        
    }
    
    protected int countNumbers(int nr){
        if(nr < 10){
            return 1;
        } else{
            return 1 + countNumbers(nr/10);
        }
    }
    
}
