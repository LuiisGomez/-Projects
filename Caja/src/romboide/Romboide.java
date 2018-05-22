/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romboide;

/**
 *
 * @author luis.gomez
 */
public class Romboide {
    //declarar atributos
    
   int l;
   int D;
   int d;
   
   
   //Metodo para calcular perimetro y area:
   
   int resultadoPerimetro(int l){
       return l*4;
   }
   int resultadoArea(int D, int d){
       return D* d /2;
   }
}
