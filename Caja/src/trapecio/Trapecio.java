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
public class Trapecio {
//Atributos.    
    int l; //lado1
    int m;//lado2
    int n;//lado3
    int o;//lado4
    int h;//altura
    int b;//base menor
    int B;//base mayor
    
//Constructor Vacio.
    Trapecio(){}

//Creacion de Metodos
    int areaTrapecio(int h,int B,int b){
    return h*B+b/2;
    }
    int perimetroTrapecio(int l,int m,int n, int o){
    return l+m+n+o;
    }
}
