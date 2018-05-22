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
public class Aritmetica {
   //Atributos de la clase!
    int a;
    int b;
    int c;
    String d;
    
    //Constructor Vacio!
   Aritmetica() {
    }
    
    //Constructor con 2 argumentos!
    
   Aritmetica(int arg1, int arg2){
       a=arg1;
       b=arg2;
   }
    //Constructor con 3 argumentos!
    
   Aritmetica(int arg1, int arg2,int arg3){
       a=arg1;
       b=arg2;
       c=arg3;
   }
   //Constructor con 5 argumentos, 3 tipo entero y 2 tipo cadena
   Aritmetica(int arg1, int arg2,int arg3,String asd,String bn){
       a=arg1;
       b=arg2;
       c=arg3;
       d=asd;
   }
   
   //Este metodo toma nuevos valores!
   int sumar(int a,int b,int c ){
        return a+b+c;
   }
   
   //Este metodo toma los atributos de la clase!
   int sumar(){
        return a+b+c;
   }
}
