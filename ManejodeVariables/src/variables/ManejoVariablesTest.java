/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author luis.gomez
 */
public class ManejoVariablesTest {
  
   public static void main(String[] args){
   
//*Variables Booleanas.
   boolean primeraOpcion;
   primeraOpcion=true; 
       System.err.println("primeraOpcion es:"+primeraOpcion);
   boolean segundaOpcion=false;
       System.out.println("segundaOpcion es:"+segundaOpcion);
   
//*Variables Byte
   byte b1=10;
   System.out.println("Variables Byte b1:"+b1);
   byte b2= 0xa;
   System.out.println("Variables Byte b2:"+b2);
 
//*Variable short
   short s1 =2;
   System.out.println("Variable short s1:"+s1);
  
   char ch1 = 65; 
   System.out.println("Variable short ch1:"+ch1);
   
   //Variables del tipo entero
   int decimal=10;
   System.out.println("Variables del tipo entero:"+decimal);
   int octal=20;
   System.out.println("Variables del tipo entero:"+octal);
   int hexa =  0x64;
   System.out.println("Variables del tipo entero:"+hexa);
   
//*Variables Long
   long long1 = 10, long2 = 20L;
   System.out.println("Variables Long:"+long1);

//*Variable float
   float f1=15, f2=22.3F;
   System.out.println("Variable float:"+f1); 
   
//*Variable double
   double d1=11.0, d2=30.15D;
   System.out.println("Variable double:"+d1);
  }
}


