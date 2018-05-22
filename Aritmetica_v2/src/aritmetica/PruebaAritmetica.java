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
        //Creamos un objeto de la clase Aritmetica con el contructor vacio! 
        Aritmetica obj1= new Aritmetica();
        
        //Llamamos el metodo sumar y recibimos el valor devuelto
        int resultado =obj1.sumar(21,382,8);

        System.out.println("Resultado suma directa obj1:"+resultado);
        
        //Si llamamos directamente el metodo sumar sin argumentos
        //el valor es cero, ya que los atributos del objeto nunca se inicializaron
        //ya que no se uso el constructor con argumentos, si no el contructor vacio.
        
        System.out.println("Resultado suma atributos obj1:\t"+obj1.sumar());
        
        Aritmetica obj2 = new Aritmetica(2,3,9);
        System.out.println("Resultado suma directa del obj2:\t"+obj2.sumar());
    }
  
}
