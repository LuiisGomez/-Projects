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
import java.util.Scanner;

public class NewClass {
    public  static void  main(String[] args){
        System.out.println("Introducir el numero de iteraciones:");
        int limite;
        Scanner entradaScanner = new Scanner(System.in);// se crea el objeto Scanner
        limite=entradaScanner.nextInt();
        int contador=0;
        do{
            System.out.println("contador ="+contador);
            contador ++;
        }
        while(contador<limite);
    }
}
