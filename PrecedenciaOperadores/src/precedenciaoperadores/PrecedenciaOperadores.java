/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package precedenciaoperadores;

/**
 *
 * @author luis.gomez
 */
public class PrecedenciaOperadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejemplo precedencia de Operadores:");
        
        int x=7;
        int y=10;
        int z= x++ * y++;
        System.out.println("x = "+x);
        System.out.println("y ="+y);
        System.out.println("z ="+z);
        
        System.out.println("Ejemplo Evaluacion"); 
        System.out.println(4 + 5 * 6 / 3); 
        System.out.println((4 + 5) * (6 / 3));
        
        System.out.println("Otro Ejemplo Evaluacion"); 
        System.out.println(1 + 2 - 3 * 4 / 5); 
        System.out.println(1 + 2 - (3 * (4 / 5)));
        
        System.out.println("\nOtro ejemplo");
        //Si detecta una cadena, lo demas lo convierte en cadana 
        System.out.println("1 + 2 = " + 1 + 2); 
        //Los parentesis rompen esta regla, ya que tiene la mayor prioridad 
        System.out.println("(1 + 2) = " + (1 + 2));
        
        
        System.out.println("\nOtro ejemplo"); 
        //El operador + es asociativo a la izquierda 
        System.out.println(1 + 2 + "abc");//Detecta una operacion primero 
        System.out.println("abc" + 1 + 2);//Detecta una cadena primero


    }
    
}
