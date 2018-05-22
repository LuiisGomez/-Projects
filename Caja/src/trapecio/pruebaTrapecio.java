/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trapecio;

/**
 *
 * @author luis.gomez
 */
public class pruebaTrapecio {
    public static void main(String args[]){
    //creacion del objeto
Trapecio objeTrapecio=new Trapecio();

int resultadoPerimetro=objeTrapecio.perimetroTrapecio(5, 10, 15, 20);
        System.out.println("Resultado del perimetro del trapecio:\t"+resultadoPerimetro);
        
int resultadoArea=objeTrapecio.areaTrapecio(10, 20, 30);
        System.out.println("Resultado del area del trapecio:\t"+resultadoArea);
    }
}
