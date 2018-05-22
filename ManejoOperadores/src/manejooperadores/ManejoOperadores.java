/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejooperadores;

/**
 *
 * @author luis.gomez
 */
public class ManejoOperadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Manejo de Operadores Aritmeticos:");
        int a= 1+2;
        int b= a*5;
        float c= b/2;
        int d= b - a;
        int e= -d;
        
        System.out.println("a = " + a); 
        System.out.println("b = " + b); 
        System.out.println("c = " + c); 
        System.out.println("d = " + d); 
        System.out.println("e = " + e);
        
        System.out.println("\nOperador Modulo (Residuo):");
        System.out.println("x mod 10="+ 100%8);
        
        System.out.println("\nOperador Compuesto:");
        a += 2; 
        b -= 4; 
        c *= a;
        System.out.println("a = " + a); 
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        System.out.println("\nOperador Incremento:"); 
        //int a = a + 1; 
        //Puede reescribierse como a++; 
        System.out.println("a = " + a);
        //Preincremento/decremento (se incrementa antes de asignar el valor)
        c = ++a; 
        //Postincremento/decremento (se incrementa despues de asignar el valor) //La siguiente vez que se evalua b, es cuando se incrementa 
        d = b++; 
        System.out.println("b = " + b); 
        System.out.println("c = " + c); 
        System.out.println("d = " + d);
        
        System.out.println("\nOperador relacional:");
        //a es menor que b
        boolean res = a>b;
        System.out.println("res = "+ res);
        
        System.out.println("\nOperador Ternario:");
        int min= (a>b)? a:b;
        System.out.println("min = "+min);
        
        System.out.println("\nOperador de Asignacion:");
        int i,j,k;
        //cadena de asignacion
        i=j=k=100;
        System.out.println("i="+i);
        System.out.println("j ="+j);
        System.out.println("k="+k);
        
    }
    
}