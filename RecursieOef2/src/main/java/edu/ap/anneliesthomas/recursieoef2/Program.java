/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.anneliesthomas.recursieoef2;

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
        
        program.countDown(10);
    }
    
    protected void countDown(int start){
        if(start == 0){
            System.out.println("Take off!");
        } else{
            System.out.println(start);
            countDown(--start);
        }
    }
    
}
