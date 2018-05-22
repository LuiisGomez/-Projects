/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

/**
 *
 * @author luis.gomez
 */
public class PruebaAritmetica {
    public static void main(String args[]){
        //Creamos el Objeto de la clase Aritmetica
        Aritmetica a= new Aritmetica();
        
        //Llamamos el metodo sumar y recibimos el valor devuelto
        int resultado =a.sumar(200, 4);

        System.out.println("La suma es:"+resultado);
    }
    
}
