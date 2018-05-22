/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliclodowhile;

/**
 *
 * @author luis.gomez
 */
public class ClicloDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int contador =0;
     int limite=10;
     do{
         System.out.println("contador ="+contador);
         contador++;
     }
     while(contador<limite);
    }
    
}
