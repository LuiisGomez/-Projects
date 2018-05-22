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
    
   Aritmetica(int a, int b){
       this.a=a;
       this.b=b;
   }
   
   //Este metodo toma nuevos valores!
   int sumar(int a,int b){
        return a+b;
   }
   
   //Este metodo toma los atributos de la clase para efectuar la suma
   int sumar(){
        return a+b;
   }
   //Metodo restar
   int restar(){
   return a-b;
   }
   //Metodo multiplicar
   int multiplicar(){
   return a*b;
   }
   //Metodo dividir
   float dividir(){
   return a/b;
   }
}
