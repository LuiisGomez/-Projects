/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

/**
 *
 * @author luis.gomez
 */
public class Caja {
//Atributos de la clase Caja    
    int ancho;
    int alto;
    int profundo;
    
//Constructor vacio.
    Caja(){}
    
//Constructor con argumentos
    Caja(int ancho,int alto,int profundo){
        this.ancho=ancho;
        this.alto=alto;
        this.profundo=profundo;
    }
    
//Creacion del metodo para calcular el volumen de la caja
    int volumenCaja(int ancho,int alto, int profundo){
    return ancho*alto*profundo;
    }
}
