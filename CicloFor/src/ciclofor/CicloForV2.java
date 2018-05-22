/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclofor;

/**
 *
 * @author luis.gomez
 */
import java.util.Scanner;
public class CicloForV2 {
    public static void main(String[] args){
        System.out.println("Introducir el numero de iteraciones:");
        int maxElement;
        Scanner scannerElement= new Scanner(System.in);
        maxElement=scannerElement.nextInt();
        
        for(int contador=0;contador<maxElement;contador++){
            System.out.println("contador es ="+ contador);
        }                           
    }
}
