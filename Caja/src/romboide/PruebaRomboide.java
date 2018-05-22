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
public class PruebaRomboide {
    public static void main(String args[]){
    Romboide objRomboide=new Romboide();
    int resultadoPerimetro =objRomboide.resultadoPerimetro(10);
    int resultadoArea=objRomboide.resultadoArea(30, 20);
        System.out.println("Resultado Perimetro:\t"+resultadoPerimetro);
        System.out.println("Resultado Area:\t"+resultadoArea);
    
    }
}
