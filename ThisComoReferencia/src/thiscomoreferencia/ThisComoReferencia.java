/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thiscomoreferencia;

/**
 *
 * @author luis.gomez
 */
public class ThisComoReferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Persona p = new Persona("Alberto");
     
    }
}
class Persona{
String nombre;  //Atributos de la clase

    Persona(String nombre){
        this.nombre=nombre; //this es el objeto persona (actual)
        System.out.println(nombre);
    
    //imprimimos el objeto persona
    Imprimir i = new Imprimir();
        System.out.println(i);
    i.imprimir(this);   //this es el objeto persona (actual)
        System.out.println(i);
   
    }
}
class Imprimir{
    public void imprimir(Object o){
        System.out.println("Imprimir parametros:"+o);
        System.out.println("Imprimir objeto actual (this):"+this);
    }
}