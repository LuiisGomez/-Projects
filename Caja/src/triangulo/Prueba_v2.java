/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

/**
 *
 * @author luis.gomez
 */
public class Prueba_v2 {
    public static void main(String args[]){
    //Creacion del objeto triangulo
        Triangulo objTriangulo=new Triangulo();
    //llamamos al metodo perimetroTriangulo y recibimos el valor devuelto
        int resultado=objTriangulo.perimetroTriangulo(10, 10);
        
        System.out.println("El perimetro de un triangulo es:\t"+resultado);
    }
}
