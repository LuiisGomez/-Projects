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
        //Variables Locales.
        int operandoVara=10;
        int operandoVarb=3;
    
    //Se crea un objeto de la clase Aritmetica mandando argumentos.
    Aritmetica obj1=new Aritmetica(operandoVara,operandoVarb);
    //Imprimir Operandos:    
        System.out.println("\nOperando a:\t"+operandoVara+"\tOperando b:\t"+operandoVarb);
    //Resultado suma:
        System.out.println("\nsuma:\t"+obj1.sumar());
    //Resultado resta:
        System.out.println("\nresta:\t"+obj1.restar());
    //Resultado multiplicar:
        System.out.println("\nmultiplicar:\t"+obj1.multiplicar());
    //Resultado dividir:
        System.out.println("\ndividir:\t"+obj1.dividir());
    }
}
