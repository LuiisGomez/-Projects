/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoporvalor;

/**
 *
 * @author luis.gomez
 */
public class PasoPorValor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int x=30;
        System.out.println(x);
    imprimir(x);
        System.out.println(x);
    cambiarValor(x);
        System.out.println(x);
    imprimir(x);
        System.out.println(x);
        
    }
    public static void imprimir(int arg){
        System.out.println("Valor recibido:"+arg);
    }
    public static void cambiarValor(int i){
      i=200;
    }
}
